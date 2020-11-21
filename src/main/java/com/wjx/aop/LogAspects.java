package com.wjx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {

    //抽取公共的切入点表达式
    //1. 本类引用  @Before("pointCut()")
    //2. 其他外部切面引用

    @Pointcut("execution(public int com.wjx.aop.MathCalculator.*(..))")
    public void pointCut(){}

    //@Before("public int com.wjx.aop.MathCalculator.*(..)")
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] obj = joinPoint.getArgs();
        System.out.println("除法运行 参数是：{" + Arrays.asList(obj) + "}");
    }

    @After("com.wjx.aop.LogAspects.pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("除法结束" + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法结果 返回结果是：{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常 异常信息是：{" + exception + "}");
    }
}
