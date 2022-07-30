package com.dzq.dao.impl;

import com.dzq.dao.EmpDao;
import com.dzq.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 20:11
 * @Description: com.dzq.dao.impl
 * @version: 1.0
 */
@Repository
public class EmpDaoImpl implements EmpDao {
    public int add(Integer empid, String empname, String deptno){
        System.out.println("EmpDaoImpl run-->");
        return 1;
    }
}
