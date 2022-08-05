package com.dzq;

import com.dzq.services.UserService;
import com.dzq.services.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/5 - 08 - 05 - 16:02
 * @Description: com.dzq
 * @version: 1.0
 */
public class Test01 {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = applicationContext.getBean( UserServiceImpl.class);
        userServiceImpl.add();

        System.out.println(userServiceImpl.getName());
        System.out.println(userServiceImpl.getAge());
    }
}
