package com.EugeneStudio.apartmentWebsite.mapper;

import com.EugeneStudio.apartmentWebsite.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(String email);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String email);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUser(@Param("email") String email, @Param("password") String password);
}