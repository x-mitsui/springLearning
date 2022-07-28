package com.dzq.bean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 18:57
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class Desk {
    private double height;

    @Override
    public String toString() {
        return "Desk{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Desk() {
    }

    public Desk(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    private double width;
    private double length;
}
