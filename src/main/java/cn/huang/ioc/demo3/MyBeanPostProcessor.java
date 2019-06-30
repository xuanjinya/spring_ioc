package cn.huang.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Yaking
 * @Date: 2019/6/29 17:05
 * @Describe:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        super();
    }

    /*初始化前执行的方法*/
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：初始化前执行的方法");
        return bean;
    }

    /*初始化后执行的方法*/
    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("第八步：初始化后执行的方法");
        if ("userDao".equals(beanName)) {
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if("save".equals(method.getName())) {
                        System.out.println("权限校验===================");
                        return  method.invoke(bean,args);
                    }
                    return  method.invoke(bean,args);
                }
            });
            return proxy;
        } else {
            return bean;
        }
    }
}
