package com.dzq.service.impl;

import com.dzq.dao.UserDao;
import com.dzq.dao.impl.UserDaoImpl;
import com.dzq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 20:12
 * @Description: com.dzq.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public int add(Integer userid, String username) {
        System.out.println("UserService run!");
        userDao.add(userid,username);
        return 0;
    }
}
