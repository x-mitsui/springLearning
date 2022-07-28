package com.dzq.bean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 20:06
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class A {
    private B b;

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }

    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
