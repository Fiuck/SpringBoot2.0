package top.lemcoo.circulate.javaWay;

/**
 * 【】
 *
 * @Author: zwx
 * @Date: 2021/3/9 09:18
 */
public class Test1 {
    public static void main(String[] args){
        TestA testA = new TestA();
        TestB testB = new TestB();
        TestC testC = new TestC();

        testA.setB(testB);
        testB.setC(testC);
        testC.setA(testA);
    }
}
