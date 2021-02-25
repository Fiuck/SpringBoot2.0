package top.lemcoo.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.lemcoo.demo.beans.Emp;
import top.lemcoo.demo.beans.User;

/**
 * 【】
 *
 * @Author: zhaowx
 * @Date: 2021/2/23 22:41
 */

@Configuration(proxyBeanMethods = true)
public class MyConfig {


    @Bean("user")
    public User getUser(){
        User user = new User();
        // 在user组件 中依赖了 emp组件
        user.setEmp(getEmp());
        return user;
    }

    @Bean("emp")
    public Emp getEmp(){
        return new Emp();
    }
}
