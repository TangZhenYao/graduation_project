package com.example.xxx.mapper;

import com.example.xxx.entity.Dissertation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>Title: com.example.xxx.mapper</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/16
 */
@Mapper
public interface DissertationMapper {
    public List<Dissertation> selectDissertationByStu_ID(String stu_id);
}
