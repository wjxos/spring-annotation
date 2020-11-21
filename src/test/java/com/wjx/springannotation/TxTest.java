package com.wjx.springannotation;

import com.wjx.tx.TxConfig;
import com.wjx.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.insert();
    }

}
