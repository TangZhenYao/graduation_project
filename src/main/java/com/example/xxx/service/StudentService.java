package com.example.xxx.service;

import com.example.xxx.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.Subject;
import java.util.List;

/**
 * <p>Title: com.example.xxx.service</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/11
 */
@Service
public class StudentService {
    @Autowired
    private StudentsMapper studentsMapper;

    /*public List<Subject> selectSubjectss() {
        List<Subject> subjects = studentsMapper.selectSubjectss();
        for (Subject subject : subjects) {
            System.out.println("mapper返回给service："+subject);
        }
        return subjects;
    }*/

    /**/

}
