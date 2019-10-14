package com.example.xxx.service;

import com.example.xxx.entity.Teacher;
import com.example.xxx.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: com.example.xxx.service</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/11
 */
@Service
public class TeacherServicce {
    @Autowired
    private TeacherMapper teacherMapper;


    public List<Teacher> selectTeachers() {
        List<Teacher> teachers = teacherMapper.selectTeacher();
        for (Teacher teacher : teachers) {
            System.out.println("mapper返回给service："+teacher);
        }
        return teachers;
    }
}
