package com.example.xxx.entity;

import java.util.List;

/**
 * <p>Title: com.example.xxx.entity</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/10
 */
/*CREATE TABLE `Teacher` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_ID` varchar(225) NOT NULL,
  `t_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `t_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `t_address` varchar(255) DEFAULT NULL,
  `t_class` varchar(255) DEFAULT NULL,
  `t_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;*/
public class Teacher {
    private Integer t_id;
    private String tea_ID;
    private String t_name;
    private String t_password;
    private String t_address;
    private String t_class;
    private String t_phone;
    private List<Subjects> list;

    public List<Subjects> getList() {
        return list;
    }

    public void setList(List<Subjects> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", tea_ID='" + tea_ID + '\'' +
                ", t_name='" + t_name + '\'' +
                ", t_password='" + t_password + '\'' +
                ", t_address='" + t_address + '\'' +
                ", t_class='" + t_class + '\'' +
                ", t_phone='" + t_phone + '\'' +
                ", list=" + list +
                '}';
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getTea_ID() {
        return tea_ID;
    }

    public void setTea_ID(String tea_ID) {
        this.tea_ID = tea_ID;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_password() {
        return t_password;
    }

    public void setT_password(String t_password) {
        this.t_password = t_password;
    }

    public String getT_address() {
        return t_address;
    }

    public void setT_address(String t_address) {
        this.t_address = t_address;
    }

    public String getT_class() {
        return t_class;
    }

    public void setT_class(String t_class) {
        this.t_class = t_class;
    }

    public String getT_phone() {
        return t_phone;
    }

    public void setT_phone(String t_phone) {
        this.t_phone = t_phone;
    }
}
