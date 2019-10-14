package com.example.xxx.controller;

import com.example.xxx.entity.Subjects;
import com.example.xxx.entity.Teacher;
import com.example.xxx.service.SubjectsService;
import com.example.xxx.service.TeacherServicce;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

    /*
    * 查看学生主页
    * */
    @RequestMapping("Home")
//    @ResponseBody
    public String Home(Model model){
        List<Teacher> teachers = teacherServicce.selectTeachers();
        System.out.println("课题有："+teachers);
        for (Teacher teacher : teachers) {
            System.out.println("课题有：" + teacher);
        }
        model.addAttribute("teachers",teachers);
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
