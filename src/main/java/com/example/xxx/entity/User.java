package com.example.xxx.entity;

/**
 * <p>Title: com.example.xxx.entity</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/9
 */
public class User {
    private Integer u_id;
    private String stu_ID; //学生学号
    private String u_name;  //用户姓名
    private String password; //用户密码
    private String address;  //用户地址
    private String u_type;  //类型（学生||老师）
    private String u_class; //班级
    private String phone;  //电话

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", stu_ID='" + stu_ID + '\'' +
                ", u_name='" + u_name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", u_type='" + u_type + '\'' +
                ", u_class='" + u_class + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getStu_ID() {
        return stu_ID;
    }

    public void setStu_ID(String stu_ID) {
        this.stu_ID = stu_ID;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getU_type() {
        return u_type;
    }

    public void setU_type(String u_type) {
        this.u_type = u_type;
    }

    public String getU_class() {
        return u_class;
    }

    public void setU_class(String u_class) {
        this.u_class = u_class;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
