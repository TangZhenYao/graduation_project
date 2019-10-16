package com.example.xxx.controller;

import com.example.xxx.entity.Dissertation;
import com.example.xxx.entity.Subjects;
import com.example.xxx.entity.Teacher;
import com.example.xxx.service.DissertationService;
import com.example.xxx.service.SubjectsService;
import com.example.xxx.service.TeacherServicce;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.Subject;
import java.util.List;

/**
 * <p>Title: com.example.xxx.controller</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/11
 */
@Controller
public class StudentHome {
    @Autowired
    private SubjectsService subjectsService;
    @Autowired
    private TeacherServicce teacherServicce;
    @Autowired
    private DissertationService dissertationService;

    /*
    * 查看学生主页
    * */
    @RequestMapping("Home")
//    @ResponseBody
    public String Home(Model model/*,String stu_ID*/){
        //查看课题信息
        List<Teacher> teachers = teacherServicce.selectTeachers();
        System.out.println("遍历前课题有："+teachers);
        for (Teacher teacher : teachers) {
            System.out.println("遍历后课题有：" + teacher);
        }
        model.addAttribute("teachers",teachers);
        //查看论文情况
//        Dissertation stu =new Dissertation();
//        stu.getStu_ID()=("116333540101");
        String stu_ID = "116333540101";
        List<Dissertation> lists = dissertationService.selectDissertationByStu_ID(stu_ID);
        for (Dissertation dissertation : lists) {
            System.out.println("学生个人的论文提交情况："+dissertation);
        }
        model.addAttribute("dissertation",lists);
        return "StudentHome";
//        return null;
    }
    /*
    * 查看课程详情
    * */
    @RequestMapping("selectSubjects")
    public String selectSubjectsBySu_id(@Param("s.su_id") Integer su_id , Model model){
//        Subjects
        System.out.println("课题的su_id="+su_id);
        Subjects subjects = subjectsService.selectSubjectsBySu_id(su_id);
        System.out.println("课题详细信息："+subjects);
        model.addAttribute("subjects",subjects);
//        model.addAttribute(subjects);
        return "subjects_detailed";
    }

}
