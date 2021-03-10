package top.lemcoo.circulate.javaWay;

/**
 * 【】
 *
 * @Author: zwx
 * @Date: 2021/3/9 09:17
 */
public class TestA {

    private TestB b;

    public void setB(TestB b) {
        this.b = b;
        System.out.println("在A里设置了B");
    }
}
