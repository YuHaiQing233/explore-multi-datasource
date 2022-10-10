package com.explore.service.slave.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.explore.entity.slave.Order;
import com.explore.mapper.slave.OrderMapper;
import com.explore.service.slave.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author yuhaiqing
 * @description 针对表【order】的数据库操作Service实现
 * @createDate 2022-10-09 15:45:09
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}




