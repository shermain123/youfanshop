package com.youfan.controller;

import com.youfan.domain.Order;
import com.youfan.domain.OrderDetail;
import com.youfan.service.OrderDetailService;
import com.youfan.service.OrderService;
import com.youfan.vo.OrderAll;
import com.youfan.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@RestController
public class OrderOutControl {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping(value = "/insertOutOrder",method = RequestMethod.POST)
    public void insertOrder(@RequestBody OrderAll orderAll){
        Order order = orderAll.getOrder();
        OrderDetail orderDetail = orderAll.getOrderDetail();
        orderService.insertOrder(order);
        orderDetail.setCreatetime(order.getCreatetime());
        orderDetail.setOrderid(order.getId());
        orderDetailService.insertOrderDetail(orderDetail);
    }


}
