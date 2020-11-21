## APO

 *  在程序运行期间动态的将某段代码切入指定定位置运行的编程方式
 *  定义一个业务逻辑类; 在业务逻辑运行的时候，经日志进行打印（方法前，方法后，方法出现异常）
     * 前置通知（@Befor）
     * 后置通知（@After）
     * 返回通知（@AfterReturning）
     * 异常通知（@AfterThrowing）
     * 环绕通知（@Around）
 *  将切面类和被切的容器类都加入到容器中
 *  告诉spring那个是切面类 @Aspect
 *  给配置类加 @EnableAspectJAutoProxy （开启基于注解的AOP）
 *  JoinPoint 一定要在所有参数的最左边否则报错

### 三步开启AOP
1. 将也无逻辑和切面都加入到容器中，告诉spring那个切面，（@Aspect）
2. 在切面类上的每一个通知方法上标注通知注解，告诉spring何时何地运行，（切入点表达式）
3. 开启基于注解的APO (@EnableAspectJAutoProxy)

java.lang.ArithmeticException: / by zero (被除数不能为另零)

## 总结
1. spring在容器启动的时候，先会保存所有的注册进来的Bean的定义信息
   * xml注册bean
   * 注解注册bean @Controller @Component @Bean
2. spring容器会在合适的时机创建bean
   * 用到这个bean的时候；利用getBean创建bean；创建好之后保存在容器中；
   * 统一创建所有bean的时候;
3. 后置处理器
   * 每一个bean创建完成，都会使用各种后置处理器；来增强bean的功能
4. 事件驱动模型
   * ApplicationListener  事件监听
        
