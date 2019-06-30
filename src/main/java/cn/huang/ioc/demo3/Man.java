package cn.huang.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: Yaking
 * @Date: 2019/6/29 13:27
 * @Describe:
 */
public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public void setName(String name) {
        System.out.println("第二步：设置属性！");
        this.name = name;
    }

    public Man() {
        System.out.println("第一步：Man被实例化了。。。");
    }

    public void init() {
        System.out.println("第七步：Man被初始化了。。。");
    }

    public void teardown() {
        System.out.println("第十一步：（执行自己配置的销毁）Man被销毁了。。。");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第三步：设置bean的名称" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂的信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后执行的方法");
    }

    public void run() {
        System.out.println("第九步：执行自身的业务方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：执行spring的销毁方法");
    }
}
