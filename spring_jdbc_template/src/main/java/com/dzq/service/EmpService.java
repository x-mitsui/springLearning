package com.dzq.service;

import com.dzq.pojo.Emp;

import java.util.Date;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/31 - 07 - 31 - 17:12
 * @Description: com.dzq.service
 * @version: 1.0
 */
public interface EmpService {
    int add(String name, String job, String mgr, Date hiredate, Integer sal, Integer comm, Integer deptno);

    int updateEmp(Emp emp);

    int deleteEmp(int empno);

    int findEmpCount();

    Emp findEmpByEmpno(Integer Empno);

    List<Emp> findEmpByDeptno(Integer Deptno);
}
