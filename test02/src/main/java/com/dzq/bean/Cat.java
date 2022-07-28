package com.dzq.bean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 15:56
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Cat(String name, Mouse mouse) {
        this.name = name;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", mouse=" + mouse +
                '}';
    }

    public Cat() {
    }

    private Mouse mouse;
}
