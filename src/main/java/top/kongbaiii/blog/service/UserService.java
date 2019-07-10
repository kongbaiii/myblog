package top.kongbaiii.blog.service;

import top.kongbaiii.blog.entity.User;

import java.util.List;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:25
 */
public interface UserService {

    /**
     * 获取所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 存储用户
     * @param user
     */
    void add(User user);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(String id);


    void update(User user);

    void delete(String id);
}
