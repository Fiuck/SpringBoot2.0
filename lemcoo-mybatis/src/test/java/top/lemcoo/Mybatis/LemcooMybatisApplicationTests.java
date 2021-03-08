package top.lemcoo.Mybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lemcoo.Mybatis.service.UserService;

@Slf4j
@SpringBootTest
class LemcooMybatisApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        log.info("这是info日志：{}", 123);
        System.out.println(userService.getUserList());
    }

}
