package top.lemcoo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.lemcoo.autoconfigure.service.HelloService;

@SpringBootApplication
public class LemcooTestautoconfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(LemcooTestautoconfigurationApplication.class, args);
    }

}
