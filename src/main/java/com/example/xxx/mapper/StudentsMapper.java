package com.example.xxx.mapper;

import com.example.xxx.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.security.auth.Subject;
import java.util.List;

/**
 * <p>Title: com.example.xxx.mapper</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/10
 */
@Mapper
public interface StudentsMapper {

    public Students selectByStu_IDAndPassword(/*@Param("stu_id")*/ String stu_ID,/*@Param("s_password") */String s_password);

    public Students selectStudentByStu_ID(String stu_id);

    public boolean updateStudentByStu_ID(Students students);

//    public List<Subject> selectSubjectss();
}
