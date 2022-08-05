package com.dzq.dao.impl;

import com.dzq.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: x_mitsui
 * @Date: 2022/8/5 - 08 - 05 - 15:56
 * @Description: com.dzq.dao.impl
 * @version: 1.0
 */
@Repository
public class UserDaoImplA implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImplA add.....");
    }
}
