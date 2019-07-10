package top.kongbaiii.blog.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:38
 */
@Data
@AllArgsConstructor
public class PageResult<T> {

    //总页数
    private Long totalPages;

    //分页结果
    private List<T> rows;



}
