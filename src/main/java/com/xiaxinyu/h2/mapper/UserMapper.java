package com.xiaxinyu.h2.mapper;

import com.xiaxinyu.h2.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    @Select("select * from user where id= #{id}")
    User findById(Integer id);
}
