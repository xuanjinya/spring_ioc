package cn.huang.ioc.demo4;

/**
 * @Author: Yaking
 * @Date: 2019/6/30 9:40
 * @Describe:
 */
public class Category {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
