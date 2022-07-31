package com.dzq.dao.impl;

import com.dzq.dao.EmpDao;
import com.dzq.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/31 - 07 - 31 - 17:13
 * @Description: com.dzq.dao.impl
 * @version: 1.0
 */
@Repository
public class EmpDaoImpl implements EmpDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(String name, String job, String mgr, Date hiredate, Integer sal, Integer comm, Integer deptno) {

        String sql = "insert into emp values(DEFAULT,?,?,?,?,?,?,?)";
        Object[] objs = {name, job, mgr, hiredate, sal, comm, deptno};
        Integer integer = jdbcTemplate.update(sql, objs);//参数2 设置结果的类型
        return integer;
    }

    @Override
    public int updateEmp(Emp emp) {
        String sql = "update emp set ename =? , job =?, mgr=? , hiredate =?, sal=?, comm=?, deptno =? where empno =?";
        Object[] args = {emp.getEname(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(), emp.getComm(), emp.getDeptno(), emp.getEmpno()};
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int deleteEmp(int empno) {
        String sql = "delete  from emp where empno =?";
        return jdbcTemplate.update(sql, empno);
    }

    @Override
    public int findEmpCount() {
        String sql = "select count(1) from emp";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);//参数2 设置结果的类型
        return integer;
    }

    @Override
    public Emp findEmpByEmpno(Integer Empno) {
        String sql = "select * from emp where empno = ?";
        // 封装结果的实体类对象
        BeanPropertyRowMapper<Emp> rowMapper = new BeanPropertyRowMapper<Emp>(Emp.class);
        Emp emp = jdbcTemplate.queryForObject(sql, rowMapper, Empno);
        return emp;
    }

    @Override
    public List<Emp> findEmpByDeptno(Integer Deptno) {
        String sql = "select * from emp where deptno = ?";
        BeanPropertyRowMapper<Emp> rowMapper = new BeanPropertyRowMapper<Emp>(Emp.class);
        List<Emp> empList = jdbcTemplate.query(sql, rowMapper, Deptno);
        return empList;
    }
}
