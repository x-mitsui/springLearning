package com.dzq.dao.impl;

import com.dzq.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 20:11
 * @Description: com.dzq.dao.impl
 * @version: 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    public int add(Integer userid, String username) {
        System.out.println("UserDaoImpl run-->");
        return 1;
    }
}
