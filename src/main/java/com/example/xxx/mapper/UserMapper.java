package com.example.xxx.mapper;

import com.example.xxx.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>Title: com.example.xxx.mapper</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/9
 */
@Mapper
public interface UserMapper {
    public User selectUserByName();

    public User selectUserByNameAndPassword(String u_name, String password);
}
