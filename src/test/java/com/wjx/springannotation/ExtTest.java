package com.wjx.springannotation;

import com.wjx.ext.ExtConfig;
import com.wjx.tx.TxConfig;
import com.wjx.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExtTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.insert();
    }

}
