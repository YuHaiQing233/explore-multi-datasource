package com.explore.controller;

import com.explore.entity.slave.Order;
import com.explore.service.slave.OrderService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author HaiQing.Yu
 * @Date 2022/10/9 15:40
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public String orderDetail(@PathVariable Long orderId){
        Order order = orderService.getById(orderId);
        if(ObjectUtils.isEmpty(order)){
            return "订单不存在";
        }
        return "订单编号：" + order.getOrderNo() + " 用户Id:" + order.getUserId();
    }

}
