package com.dzq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 14:44
 * @Description: com.dzq.config
 * @version: 1.0
 */
@ComponentScan("com.dzq")
@PropertySource("classpath:aaa.properties")
public class ApplicationConfig {
}
