package top.kongbaiii.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.kongbaiii.blog.entity.Category;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:18
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
