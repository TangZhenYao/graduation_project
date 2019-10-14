package com.example.xxx.entity;

/**
 * <p>Title: com.example.xxx.entity</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/10
 */
/*CREATE TABLE `students` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_ID` varchar(225) NOT NULL,
  `s_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `s_address` varchar(255) DEFAULT NULL,
  `s_class` varchar(255) DEFAULT NULL,
  `s_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/

public class Students {
    private Integer s_id;
    private String stu_ID;
    private String s_name;
    private String s_password;
    private String s_address;
    private String s_class;
    private String s_phone;

    @Override
    public String toString() {
        return "Students{" +
                "s_id=" + s_id +
                ", stu_ID='" + stu_ID + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_address='" + s_address + '\'' +
                ", s_class='" + s_class + '\'' +
                ", s_phone='" + s_phone + '\'' +
                '}';
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getStu_ID() {
        return stu_ID;
    }

    public void setStu_ID(String stu_ID) {
        this.stu_ID = stu_ID;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public String getS_class() {
        return s_class;
    }

    public void setS_class(String s_class) {
        this.s_class = s_class;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }
}
