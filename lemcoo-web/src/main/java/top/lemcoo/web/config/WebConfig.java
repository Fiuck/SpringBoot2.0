package top.lemcoo.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.lemcoo.web.interceptor.HelloInterceptor;

/**
 * 【】
 *
 * @Author: zhaowx
 * @Date: 2021/2/28 19:39
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HelloInterceptor())
                .addPathPatterns("/hello")
                ;
    }
}
