package top.lemcoo.Mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.lemcoo.Mybatis.mapper")
public class LemcooMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LemcooMybatisApplication.class, args);
    }

}
