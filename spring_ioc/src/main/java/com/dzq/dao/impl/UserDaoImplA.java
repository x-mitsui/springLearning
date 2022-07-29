package com.dzq.dao.impl;

import com.dzq.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 13:40
 * @Description: com.dzq.Dao.Impl
 * @version: 1.0
 */
@Repository
public class UserDaoImplA implements UserDao {
    @Value("${Jname}")
    private String Jname;
    @Value("${Jage}")
    private Integer age;
    @Value("${Jheight}")
    private Integer Height;

    @Override
    public String toString() {
        return "UserDaoImplA{" +
                "Jname='" + Jname + '\'' +
                ", age=" + age +
                ", Height=" + Height +
                '}';
    }

    @Override
    public void add() {
        System.out.println("UserDaoImplA add!测试");
    }

    public void print(){
        System.out.println(this);
    }
}
