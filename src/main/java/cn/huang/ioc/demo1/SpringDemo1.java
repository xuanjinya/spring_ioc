package cn.huang.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

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

    @Test
    /*读取磁盘中的配置文件*/
    public void demo3() {
        //创建Spring 的工厂类
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IDEA\\spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();
    }

    @Test
    /*传统方式工厂类*/
    public void demo4() {
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }

    @Test
    /**/
    public void demo5() {
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("E:\\IDEA\\spring_ioc\\src\\main\\resources\\applicationContext.xml"));
        //通过工厂获得类
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.sayHello();
    }
}
