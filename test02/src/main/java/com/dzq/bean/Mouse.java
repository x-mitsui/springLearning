package com.dzq.bean;

import java.util.Date;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 15:56
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class Mouse {
    private String name;
    private Date birthday;

    public Mouse() {
    }

    public Mouse(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        System.out.println("11111");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
