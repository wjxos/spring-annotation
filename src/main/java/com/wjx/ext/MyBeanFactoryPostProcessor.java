package com.wjx.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor.. postProcessorBean...");
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println("当前beanFactory中有" + count + "个bean");
        System.out.println(Arrays.asList(names));
    }
}
