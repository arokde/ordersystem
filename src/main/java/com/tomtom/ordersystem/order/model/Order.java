package com.tomtom.ordersystem.order.model;

/*
A  simple POJO used for transferring the order data
 */
public class Order {

    private String name;

    private String orderID;

    public Order(String orderID)
    {
        this.orderID = orderID;
    }


    public String getName() {
        return name;
    }

    public String getOrderID() {
        return orderID;
    }
}
