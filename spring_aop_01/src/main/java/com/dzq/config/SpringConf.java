package com.dzq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/31 - 07 - 31 - 16:18
 * @Description: com.dzq.config
 * @version: 1.0
 */
@Configuration
@ComponentScan("com.dzq")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConf {
}
