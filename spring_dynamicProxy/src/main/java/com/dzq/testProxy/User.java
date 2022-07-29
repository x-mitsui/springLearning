package com.dzq.testProxy;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/29 - 07 - 29 - 16:18
 * @Description: com.dzq
 * @version: 1.0
 */

public class User implements Dinner{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name+"睡觉");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name+"吃幻");
    }
}
