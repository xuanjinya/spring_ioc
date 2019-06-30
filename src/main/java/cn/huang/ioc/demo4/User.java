package cn.huang.ioc.demo4;

/**
 * @Author: Yaking
 * @Date: 2019/6/29 17:42
 * @Describe:
 */
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
