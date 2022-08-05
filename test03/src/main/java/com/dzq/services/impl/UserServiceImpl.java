package com.dzq.services.impl;

import com.dzq.dao.UserDao;
import com.dzq.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/5 - 08 - 05 - 15:57
 * @Description: com.dzq.services.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Value("userDaoImpl")
    String ImplName;

    @Autowired
    //@Qualifier("${userDaoImpl}")
    //@Qualifier(ImplName)
    @Qualifier("userDaoImplA")
    private UserDao userDao;

    @Value("${userDaoImpl}")
    private String name;

    @Value("${age}")
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void add(){
        System.out.println("UserServiceImpl执行");
        userDao.add();
    }
}
