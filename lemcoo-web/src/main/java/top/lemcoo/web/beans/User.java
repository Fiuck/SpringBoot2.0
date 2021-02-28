package top.lemcoo.web.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 【】
 *
 * @Author: zhaowx
 * @Date: 2021/2/28 19:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;

    private String name;

    private int age;
}
