package top.kongbaiii.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.kongbaiii.blog.entity.User;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:15
 */
public interface UserRepository extends JpaRepository<User,String> {

    /**
     * 根据Email查询用户对象
     * @param email
     * @return
     */
    User findByEmail(String email);

}
