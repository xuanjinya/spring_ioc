package cn.huang.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Yaking
 * @Date: 2019/6/28 13:32
 * @Describe:
 */
public class SpringDemo1 {
    @Test
    /*传统方式开发*/
    public void demo1() {
        //UserService userService = new UserServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        //设置属性
        userService.setName("张三");
        userService.sayHello();
    }

    @Test
    /*spring 方法实现*/
    public void demo2() {
        //创建spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }
}
