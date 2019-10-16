package com.example.xxx.entity;

/**
 * <p>Title: com.example.xxx.entity</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/14
 */
public class Dissertation {
    private Integer d_id;
    private String d_name;
    private String d_address;
    private String d_comment;
    private String d_score;
    private String stu_ID;
    private String tea_ID;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_address() {
        return d_address;
    }

    public void setD_address(String d_address) {
        this.d_address = d_address;
    }

    public String getD_comment() {
        return d_comment;
    }

    public void setD_comment(String d_comment) {
        this.d_comment = d_comment;
    }

    public String getD_score() {
        return d_score;
    }

    public void setD_score(String d_score) {
        this.d_score = d_score;
    }

    public String getStu_ID() {
        return stu_ID;
    }

    public void setStu_ID(String stu_ID) {
        this.stu_ID = stu_ID;
    }

    public String getTea_ID() {
        return tea_ID;
    }

    public void setTea_ID(String tea_ID) {
        this.tea_ID = tea_ID;
    }
}
