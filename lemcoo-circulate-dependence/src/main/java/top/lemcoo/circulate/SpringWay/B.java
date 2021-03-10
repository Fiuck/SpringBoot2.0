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
public class B {
    @Autowired
    private C c;

    public B (){
        System.out.println("B被初始化");
    }
}
