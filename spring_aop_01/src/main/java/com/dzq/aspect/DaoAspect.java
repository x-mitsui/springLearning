package com.dzq.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/30 - 07 - 30 - 19:17
 * @Description: com.dzq.aspect
 * @version: 1.0
 */
// @Component实例化此类
@Aspect
@Component
public class DaoAspect {
    // 定义公共切点以抽取重复代码片段
    @Pointcut("execution(* com.dzq.dao.*.add(..))")// 切点表达式可以直接指向接口，屏蔽具体实现类信息，降低耦合度
    public void addPointCut(){}

    @Before("addPointCut()")
    public void methodBefore(JoinPoint joinPoint){
        System.out.println("methodBefore invoked ...");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    // 无论异常与否都会执行
    @After("addPointCut()")
    public void methodAfter(){
        System.out.println("methodAfter invoked ...");
    }

    // 切点方法返回结果之后增强的功能，returning值名res对应形参res
    // 出现目标异常不执行
    @AfterReturning(value = "addPointCut()", returning = "res777")
    public void methodAfterReturn(JoinPoint joinPoint, Object res777){
        System.out.println("methodAfterReturning invoked ...");
    }


    // 只有目标产生异常才执行。
    @AfterThrowing(value = "addPointCut()",throwing = "ex666")
    public void methodAfterThrowing(Exception ex666){
        System.out.println("methodAfterThrowing invoked ...");
        System.out.println(ex666.getMessage());
    }

    // 环绕通知：切点方法之前和之后都进行功能的增强，相当于@Before+@After
    // proceedingJoinPoint代表切点
    // 返回值必须是Object,返回值抛出去
    @Around("addPointCut()")
    public Object methodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("methodAroundA invoked ...");
        Object res = proceedingJoinPoint.proceed();// 控制切点方法在此处执行，addUser
        System.out.println("methodAroundB invoked ...");
        return res;
    }

}
