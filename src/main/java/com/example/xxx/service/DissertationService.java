package com.example.xxx.service;

import com.example.xxx.entity.Dissertation;
import com.example.xxx.mapper.DissertationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: com.example.xxx.service</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/16
 */
@Service
public class DissertationService {
    @Autowired
    private DissertationMapper dissertationMapper;

    public List<Dissertation> selectDissertationByStu_ID(String stu_id) {
        List<Dissertation> list = dissertationMapper.selectDissertationByStu_ID(stu_id);
        for (Dissertation lists : list) {
            System.out.println("DissertationMapper返回给DissertationServcie的值："+lists);

        }

        return list;
    }
}

