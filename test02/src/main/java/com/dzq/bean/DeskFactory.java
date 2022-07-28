package com.dzq.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 18:57
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class DeskFactory implements FactoryBean<Desk> {
    public Desk getObject() throws Exception {
        Desk desk = new Desk();
        desk.setHeight(1.2);
        desk.setWidth(0.90);
        desk.setLength(2.2);
        return desk;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
