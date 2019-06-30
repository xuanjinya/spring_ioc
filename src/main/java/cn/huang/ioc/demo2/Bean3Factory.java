package cn.huang.ioc.demo2;

/**
 * @Author: Yaking
 * @Date: 2019/6/28 16:53
 * @Describe: Bean3的实例工厂
 */
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3 被执行了！！！");
        return new Bean3();
    }
}
