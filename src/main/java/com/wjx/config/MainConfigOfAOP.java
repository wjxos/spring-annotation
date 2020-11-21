package com.wjx.config;

import com.wjx.aop.LogAspects;
import com.wjx.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 1. 在程序运行期间动态的将某段代码切入指定定位置运行的编程方式
 * 2. 定义一个业务逻辑类; 在业务逻辑运行的时候，经日志进行打印（方法前，方法后，方法出现异常）
 * 前置通知（@Befor）
 * 后置通知（@After）
 * 返回通知（@AfterReturning）
 * 异常通知（@AfterThrowing）
 * 环绕通知（@Around）
 * 3. 将切面类和被切的容器类都加入到容器中
 * 4. 告诉spring那个是切面类 @Aspect
 * 5. 给配置类加 @EnableAspectJAutoProxy （开启基于注解的AOP）
 * 6. JoinPoint 一定要在所有参数的最左边否则报错
 *
 * 三步
 * 1. 将也无逻辑和切面都加入到容器中，告诉spring那个切面，（@Aspect）
 * 2. 在切面类上的每一个通知方法上标注通知注解，告诉spring何时何地运行，（切入点表达式）
 * 3. 开启基于注解的APO (@EnableAspectJAutoProxy)
 *
 * AOP 原理
 * 1. @EnableAspectJAutoProxy
 *    @Import({AspectJAutoProxyRegistrar.class})
 *    利用AspectJAutoProxyRegistrar自定义给容器中注册bean
 */
@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAOP {

    //业务类加入到容器中
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    //切面加入到容器中
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

}
