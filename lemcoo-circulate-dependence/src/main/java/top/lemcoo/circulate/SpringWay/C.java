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
public class C {
    @Autowired
    private A a;

    public C (){
        System.out.println("C被初始化");
    }
}
