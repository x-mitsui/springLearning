package com.dzq;

import com.dzq.pojo.Emp;
import com.dzq.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/31 - 07 - 31 - 17:19
 * @Description: com.dzq
 * @version: 1.0
 */
public class Test01 {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmpService empService = applicationContext.getBean(EmpService.class);

        System.out.println(empService.findEmpCount());
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmpService empService = applicationContext.getBean(EmpService.class);

        System.out.println(empService.findEmpByEmpno(7566));
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmpService empService = applicationContext.getBean(EmpService.class);

        System.out.println(empService.findEmpByDeptno(20));
    }

    @Test
    public void test04() throws ParseException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmpService empService = applicationContext.getBean(EmpService.class);

        System.out.println(empService.add("张三","mano","7566",new SimpleDateFormat("yyyy-MM-dd").parse("2019-03-22"),8000,200,20));
    }

    @Test
    public void test05() throws ParseException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmpService empService = applicationContext.getBean(EmpService.class);

        int rows = empService.updateEmp(new Emp(7939, "JERRY", "MANAGER", "7839", new Date(), 3000.0, 0.0, 20));

        System.out.println(rows);
    }

    @Test
    public void test06()  {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmpService empService = applicationContext.getBean(EmpService.class);

        System.out.println(empService.deleteEmp(7945));
    }
}
