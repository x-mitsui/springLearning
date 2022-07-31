package com.dzq.service.impl;

import com.dzq.dao.EmpDao;
import com.dzq.pojo.Emp;
import com.dzq.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/31 - 07 - 31 - 17:13
 * @Description: com.dzq.service.impl
 * @version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    public int add(String name, String job, String mgr, Date hiredate, Integer sal, Integer comm, Integer deptno) {
        System.out.println("add EmpService~~");
        empDao.add(name,job,mgr,hiredate,sal,comm,deptno);
        return 1;
    }

    @Override
    public int updateEmp(Emp emp) {
        return empDao.updateEmp(emp);
    }
    @Override
    public int deleteEmp(int empno) {
        return empDao.deleteEmp(empno);
    }

    public int findEmpCount() {
        return empDao.findEmpCount();
    }

    @Override
    public Emp findEmpByEmpno(Integer Empno) {
        return empDao.findEmpByEmpno(Empno);
    }

    @Override
    public List<Emp> findEmpByDeptno(Integer Deptno) {
        return empDao.findEmpByDeptno(Deptno);
    }
}
