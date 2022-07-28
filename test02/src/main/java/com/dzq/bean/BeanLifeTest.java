package com.dzq.bean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 19:16
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class BeanLifeTest {
    private int variable;

    @Override
    public String toString() {
        return "BeanLifeTest{" +
                "variable=" + variable +
                '}';
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        System.out.println("生命周期二：set方法");
        this.variable = variable;
    }

    public void initThis(){
        System.out.println("生命周期三：指定自定义的初始化方法");
    }

    public BeanLifeTest() {
        System.out.println("生命周期一：构造");
    }

    public void XBeanLifeTest() {
        System.out.println("生命周期五：指定销毁后的回调");
    }

    public BeanLifeTest(int variable) {
        this.variable = variable;
    }
}
