package com.dzq.bean;

/**
 * @Auther: x_mitsui
 * @Date: 2022/7/28 - 07 - 28 - 13:51
 * @Description: com.dzq.bean
 * @version: 1.0
 */
public class User {
    private Integer userid;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
        System.out.println("noArgConstructor");
    }

    public User(Integer userid, String username, String password) {
        System.out.println("allArgConstructor");
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public void setUserid(Integer userid) {
        System.out.println("setUserid");
        this.userid = userid;
    }

    public void setUsername(String username) {
        System.out.println("setUsername");
        this.username = username;
    }

    public void setPassword(String password) {
        System.out.println("setpassword");
        this.password = password;
    }
}
