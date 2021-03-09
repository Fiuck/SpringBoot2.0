package top.lemcoo.autoconfigure.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 【】
 *
 * @Author: zwx
 * @Date: 2021/3/8 09:31
 */
@ConfigurationProperties(prefix = "lemcoo")
public class HelloProperties {

    private String name;

    private int age;

    public HelloProperties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
