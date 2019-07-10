package top.kongbaiii.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.kongbaiii.blog.common.IdWorker;
import top.kongbaiii.blog.entity.User;
import top.kongbaiii.blog.repository.UserRepository;
import top.kongbaiii.blog.service.UserService;

import java.util.List;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:26
 */
@Service
@Transactional(rollbackFor = Exception.class )
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IdWorker idWorker;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * 新增用户
     * email为唯一索引 需要先查询数据库
     * @param user
     */
    @Override
    public void add(User user) {
        User userByEmail = userRepository.findByEmail(user.getEmail());
        if (userByEmail != null) {
            throw new RuntimeException("该邮箱已被注册！");
        }
        user.setId(idWorker.nextId() + "");
        userRepository.save(user);
    }

    @Override
    public User findById(String id) {

        return userRepository.findById(id).get();
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }
}
