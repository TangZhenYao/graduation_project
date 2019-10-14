package com.example.xxx.service;

import com.example.xxx.entity.Students;
import com.example.xxx.entity.Teacher;
import com.example.xxx.mapper.StudentsMapper;
import com.example.xxx.mapper.TeacherMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title: com.example.xxx.service</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/10
 */
@Service
public class LoginService {
    @Autowired
    private StudentsMapper studentsMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    public boolean selectByStu_IDAndPassword(/*@Param("stu_id") */String stu_ID, /*@Param("s_password")*/String s_password) {
        System.out.println("controller传过到service："+stu_ID+s_password);
        Students student=studentsMapper.selectByStu_IDAndPassword(stu_ID,s_password);
        System.out.println("mapper返回给service："+student);
        if (student == null) {
            return false;
        }else
        return true;
    }

    public boolean selectByT_nameAndPassword(String t_name, String t_password) {
        System.out.println("controller传过到service："+t_name+t_password);
        Teacher teacher=teacherMapper.selectByT_nameAndPassword(t_name,t_password);
        System.out.println("mapper返回给service："+teacher);
        if (teacher == null) {
            return false;
        }else
            return true;
    }
}
