package com.wjx.config;

import com.wjx.bean.Person;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig2 {

    @Bean
    /**
     * prototype:多实例
     * singleton:单实例
     */
    @Scope()
    @Lazy// 容器创建的时候不加载实例，第一次使用的时候创建实例
    public Person person() {
        return new Person("lisi", 25);
    }

    /**
     *@Conditional 按照一定的条件进行判断，满足条件给容器中祖册bean
     */
    @Bean("bill")
    //@Conditional(Linux.class)
    public Person person01() {
        return new Person("bills", 25);
    }
    @Bean("linas")
    //@Conditional(Linux.class)
    public Person person02() {
        return new Person("linas", 48);
    }

    /**
     * 给容器中注册组件
     * 1. 包扫描+组件注解（自己写的类）
     * 2. @Bean导入第三方包里的组件
     * 3. @Import快速的给容器中导入一个组件
     */

}
