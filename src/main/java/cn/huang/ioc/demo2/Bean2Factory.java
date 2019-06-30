package cn.huang.ioc.demo2;

/**
 * @Author: Yaking
 * @Date: 2019/6/28 16:47
 * @Describe: 静态工厂(Bean)
 */
public class Bean2Factory {
    public static Bean2 createBean2() {
        System.out.println("Bean2Factory方法已经执行了。。。。");
        return new Bean2();
    }
}
