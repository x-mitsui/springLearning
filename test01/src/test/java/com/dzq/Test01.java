package com.dzq;

import com.dzq.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/27 - 07 - 27 - 19:03
 * @Description: com.dzq
 * @version: 1.0
 */
public class Test01 {
    @Test
    public void testSpring01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //EmpDao empDao = (EmpDao)applicationContext.getBean("empDao");
        EmpDao empDao = applicationContext.getBean("empDao",EmpDao.class);
        empDao.addEmp();
    }
}
