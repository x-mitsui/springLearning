package com.dzq.dao.impl;

import com.dzq.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 13:40
 * @Description: com.dzq.Dao.Impl
 * @version: 1.0
 */
@Repository
public class UserDaoImplA implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImplA add!");
    }
}
