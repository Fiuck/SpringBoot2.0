package top.lemcoo.circulate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.lemcoo.circulate.SpringWay.A;
import top.lemcoo.circulate.SpringWay.B;
import top.lemcoo.circulate.SpringWay.C;

@SpringBootApplication
public class LemcooCirculateDependenceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LemcooCirculateDependenceApplication.class, args);
        A a = run.getBean("a", A.class);
        B b = run.getBean("b", B.class);
        C c = run.getBean("c", C.class);
    }

}
