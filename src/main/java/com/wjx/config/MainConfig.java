package com.wjx.config;

import com.wjx.bean.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//配置类=配置文件
@Configurable//告诉spring这是一个配置类
/**
 * @ComponentScan 指定要扫描的包
 * excludeFilters = Filter[] //指定使用那些规则排除那些组件
 * includeFilters = Filter[] //扫描的时候要包含那些组件
 */
@ComponentScan(value = "com.wjx", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {
                Controller.class, Service.class
        })
})
public class MainConfig {

    @Bean
    public Person person() {
        return new Person("lisi", 23);
    }

}
