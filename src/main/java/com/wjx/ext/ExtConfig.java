package com.wjx.ext;


import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * BeanPostProcessor bean的后置处理器，bean创建对象初始化前后进行拦截工作
 * BeanFactoryPostProcessor beanFactory的后置处理器
 * 在beanfactory标准初始化之后调用，所有的bean定义已经保存加载到beanFactory，但是beanFactory还未创建bean的实例
 *
 */

@ComponentScan("com.wjx.ext")
@Configuration
public class ExtConfig {



}
