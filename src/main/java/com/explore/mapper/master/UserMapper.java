package com.explore.mapper.master;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.explore.entity.master.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yuhaiqing
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-10-09 14:29:06
* @Entity com.explore.entity.master.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




