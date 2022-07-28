package com.dzq.bean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 17:26
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class Ball {
    private String name;
    private String color;

    @Override
    public String toString() {
        return "Ball{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ball(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Ball() {
    }
}
