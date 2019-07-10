package top.kongbaiii.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.kongbaiii.blog.entity.Comment;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:16
 */
public interface CommentRepository extends JpaRepository<Comment,String> {
}
