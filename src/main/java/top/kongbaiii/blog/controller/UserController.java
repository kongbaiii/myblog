package top.kongbaiii.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.kongbaiii.blog.common.Result;
import top.kongbaiii.blog.common.StatusCode;
import top.kongbaiii.blog.entity.User;
import top.kongbaiii.blog.service.UserService;

/**
 * @author kongbaiii
 * @create 2019-07-10 0:27
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping
    public Result findAll() {
        return new Result(true, StatusCode.OK,"查询成功",userService.findAll());
    }

    @PostMapping
    public Result add(@RequestBody User user) {
        userService.add(user);
        return Result.of(true,StatusCode.OK,"新增成功");
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Result findById(@PathVariable("id") String id) {
        return new Result(true,StatusCode.OK,"查询成功",userService.findById(id));
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @PutMapping("{id}")
    public Result updateUser(@PathVariable("id") String id,@RequestBody User user) {
        userService.update(user);
        return Result.of(true,StatusCode.OK,"更新成功");
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") String id) {
        userService.delete(id);
        return Result.of(true,StatusCode.OK,"删除成功");
    }
}
