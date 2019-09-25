package com.tomtom.ordersystem.order.controller;

import com.tomtom.ordersystem.order.model.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/order")
    public Order order(@RequestParam(value = "orderid") String orderID) {

                return new Order(orderID);
    }
}
