package com.tomtom.ordersystem.order;

import com.tomtom.ordersystem.order.model.Order;
import com.tomtom.ordersystem.order.service.OrderService;
import org.junit.Test;

public class OrderServiceTest {

    @Test
    public void testPlaceOrder() {
        final OrderService orderService = new OrderService();
        final Order order = new Order("1");
        orderService.placeOrder(order);
    }


}
