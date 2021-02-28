package top.lemcoo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lemcoo.web.beans.User;

/**
 * 【】
 *
 * @Author: zhaowx
 * @Date: 2021/2/28 19:38
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public User hello(){
        System.out.println("hello");
        return new User(1, "张三", 12);
    }
}
