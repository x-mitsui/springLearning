package com.dzq.service.impl;

import com.dzq.dao.EmpDao;
import com.dzq.dao.UserDao;
import com.dzq.service.EmpService;
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
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    public int add(Integer empid, String empname, String deptno) {
        System.out.println("EmpService run!");
        empDao.add(empid, empname, deptno);
        return 0;
    }
}
