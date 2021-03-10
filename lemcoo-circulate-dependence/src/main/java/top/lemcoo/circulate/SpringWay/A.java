package top.lemcoo.circulate.SpringWay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 【】
 *
 * @Author: zwx
 * @Date: 2021/3/10 08:48
 */
@Component
public class A {

    @Autowired
    private B b;

    public A (){
        System.out.println("A被初始化");
    }
}
