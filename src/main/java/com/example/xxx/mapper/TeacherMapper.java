package com.example.xxx.mapper;

import com.example.xxx.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>Title: com.example.xxx.mapper</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/11
 */
@Mapper
public interface TeacherMapper {
    public Teacher selectByT_nameAndPassword(String t_name, String t_password);
    public List<Teacher> selectTeacher();

    public Teacher selectTeacherByTea_ID(String tea_ID);
}
