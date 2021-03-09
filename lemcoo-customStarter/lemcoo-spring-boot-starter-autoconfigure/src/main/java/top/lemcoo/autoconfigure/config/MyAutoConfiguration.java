package top.lemcoo.autoconfigure.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.lemcoo.autoconfigure.beans.HelloProperties;
import top.lemcoo.autoconfigure.service.HelloService;

/**
 * 【】
 *
 * @Author: zwx
 * @Date: 2021/3/8 09:31
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class MyAutoConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
