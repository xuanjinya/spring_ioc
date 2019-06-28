package cn.huang.ioc.demo1;

/**
 * @Author: Yaking
 * @Date: 2019/6/28 13:31
 * @Describe:
 */
public class UserServiceImpl implements UserService {

    //添加属性
    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hello Spring！"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
