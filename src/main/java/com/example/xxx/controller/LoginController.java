package com.example.xxx.controller;

import com.example.xxx.entity.Students;
import com.example.xxx.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>Title: com.example.xxx.controller</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/10
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/Logins")
//    @ResponseBody
    public String goLogin(){
        return "Login";
    }
    /*学生登录：学号+密码*/
    @RequestMapping("studentslogin")
    public String studentLoginByStu_IDAndPassword(/*@Param("stu_id")*/ String stu_ID,/* @Param("s_password")*/String s_password, Model model){
        System.out.println("jsp页面的："+stu_ID+s_password);
        boolean students = loginService.selectByStu_IDAndPassword(stu_ID, s_password);
        if (students == false) {
            model.addAttribute("stu_wrong_reason","账号不存在或密码错误");
            return "Login";
        }else
        return "Home";
    }
    /*教师登录：姓名+密码*/
    @RequestMapping("teacherlogin")
    public String teacherLoginByTea_nameAndPassword(/*@Param("stu_id")*/ String t_name,/* @Param("s_password")*/String t_password, Model model){
        System.out.println("jsp页面的："+t_name+t_password);
        boolean teacher = loginService.selectByT_nameAndPassword(t_name, t_password);
        if (teacher == false) {
            model.addAttribute("tea_wrong_reason","用户不存在或密码错误");
            return "Login";
        }else
            return "Home";
    }

}
