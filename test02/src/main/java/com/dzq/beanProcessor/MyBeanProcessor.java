package com.dzq.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 19:50
 * @Description: com.dzq.beanProcessor
 * @version: 1.0
 */
// dzq：类似于拦截器
public class MyBeanProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean自定义初始化方法之前相关处理");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean自定义初始化方法之后相关处理");
        return bean;
    }
}
