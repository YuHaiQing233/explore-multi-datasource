package com.explore.mapper.slave;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.explore.entity.slave.Order;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yuhaiqing
* @description 针对表【order】的数据库操作Mapper
* @createDate 2022-10-09 15:45:09
* @Entity com.explore.entity.slave.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}




