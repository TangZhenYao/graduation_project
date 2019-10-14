package com.example.xxx.mapper;

import com.example.xxx.entity.Subjects;
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
public interface SubjectsMapper {
    public List<Subjects> selectSubjects();
}
