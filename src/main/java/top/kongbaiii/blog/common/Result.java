package top.kongbaiii.blog.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:28
 * <p>
 * 全局返回结果封装类
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
public class Result {
    /**
     * 是否成功
     */
    @NonNull
    private boolean flag;

    /***
     * 状态值
     */
    @NonNull
    private int status;

    /**
     * 自定义返回信息
     */
    @NonNull
    private String message;

    /**
     * 封装查询的结果
     */
    private Object data;

}
