package top.lemcoo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lemcoo.autoconfigure.service.HelloService;

@SpringBootTest
class LemcooTestautoconfigurationApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    void contextLoads() {
        System.out.println(helloService.say());
    }

}
