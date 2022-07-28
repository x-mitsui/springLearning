package com.dzq.bean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 20:06
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class B {
    private String name;

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B() {
    }

    public B(String name) {
        this.name = name;
    }
}
