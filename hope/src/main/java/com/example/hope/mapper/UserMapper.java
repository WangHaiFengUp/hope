package com.example.hope.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hope.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}