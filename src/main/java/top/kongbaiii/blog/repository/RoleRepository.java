package top.kongbaiii.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.kongbaiii.blog.entity.Role;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:17
 */
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
