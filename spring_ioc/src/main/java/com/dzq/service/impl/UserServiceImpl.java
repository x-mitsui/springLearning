package com.dzq.service.impl;

import com.dzq.dao.UserDao;
import com.dzq.dao.impl.UserDaoImplA;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 13:47
 * @Description: com.dzq.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    // 如果注入实例有多种实现，可以通过Qualifier指定实例，实例默认是类的首字母小写形式
    @Autowired
    @Qualifier(value = "userDaoImplA")
    private UserDao userDao;
    public void add() {
        System.out.println("UserServiceImpl add!");
        userDao.add();
    }
    @Override
    public void print(){
        ((UserDaoImplA)this.userDao).print();
    }
}
