package cn.huang.ioc.demo4;

/**
 * @Author: Yaking
 * @Date: 2019/6/29 17:59
 * @Describe:
 */
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
