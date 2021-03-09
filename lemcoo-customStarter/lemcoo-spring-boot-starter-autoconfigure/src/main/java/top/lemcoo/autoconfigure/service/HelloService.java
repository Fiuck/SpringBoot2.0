package top.lemcoo.autoconfigure.service;

import org.springframework.beans.factory.annotation.Autowired;
import top.lemcoo.autoconfigure.beans.HelloProperties;

/**
 * 【】
 *
 * @Author: zwx
 * @Date: 2021/3/8 09:31
 */
public class HelloService {

    @Autowired
    private HelloProperties helloProperties;

    public String say(){
        return "我叫" + helloProperties.getName() + "，今年我" + helloProperties.getAge() + "岁啦！";
    }
}
