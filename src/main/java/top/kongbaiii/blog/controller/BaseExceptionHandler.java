package top.kongbaiii.blog.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.kongbaiii.blog.common.Result;
import top.kongbaiii.blog.common.StatusCode;

/**
 * @author kongbaiii
 * @create 2019-07-10 1:11
 */
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e) {
        e.printStackTrace();
        return Result.of(false,StatusCode.ERROR,e.getMessage());
    }

}
