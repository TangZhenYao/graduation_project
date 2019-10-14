package com.example.xxx.service;

import com.example.xxx.entity.Subjects;
import com.example.xxx.mapper.SubjectsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SubjectsService {
    @Autowired
    private SubjectsMapper subjectsMapper;

    public Subjects selectSubjectsBySu_id(Integer su_id) {
        return subjectsMapper.selectSubjectsBySu_id(su_id);
    }


//    public void selectSubjectsBySu_id(Integer su_id) {
//    }
}
