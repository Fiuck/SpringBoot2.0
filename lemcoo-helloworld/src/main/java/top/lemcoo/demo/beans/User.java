package top.lemcoo.demo.beans;

/**
 * 【】
 *
 * @Author: zhaowx
 * @Date: 2021/2/23 22:42
 */
public class User {

    private String name;

    private int age;

    private Emp emp;

    public User() {
    }

    public User(String name, int age, Emp emp) {
        this.name = name;
        this.age = age;
        this.emp = emp;
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

    public Emp getEmp(){
        return emp;
    }

    public void setEmp(Emp emp){
        this.emp = emp;
    }
}
