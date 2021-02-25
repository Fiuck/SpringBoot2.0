package top.lemcoo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sun.rmi.runtime.Log;
import top.lemcoo.demo.beans.Emp;
import top.lemcoo.demo.beans.User;
import top.lemcoo.demo.config.MyConfig;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        System.out.println("=========================================================================================");

        MyConfig bean = run.getBean("myConfig", MyConfig.class);
        Emp emp = bean.getEmp();
        Emp emp1 = bean.getEmp();
        System.out.println(emp == emp1);

        User user = run.getBean("user", User.class);
        Emp emp2 = run.getBean("emp", Emp.class);
        System.out.println(user.getEmp() == emp2);

    }

}
