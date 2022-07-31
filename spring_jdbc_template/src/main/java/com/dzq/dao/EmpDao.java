package com.dzq.dao;

import com.dzq.pojo.Emp;

import java.util.Date;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/31 - 07 - 31 - 17:13
 * @Description: com.dzq.dao
 * @version: 1.0
 */
public interface EmpDao {
    int add(String name, String job, String mgr, Date hiredate, Integer sal, Integer comm, Integer deptno);

    int updateEmp(Emp emp);

    int deleteEmp(int empno);

    int findEmpCount();

    Emp findEmpByEmpno(Integer Empno);

    List<Emp> findEmpByDeptno(Integer Deptno);
}
