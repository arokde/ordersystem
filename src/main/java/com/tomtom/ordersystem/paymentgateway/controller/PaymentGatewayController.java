package com.tomtom.ordersystem.paymentgateway.controller;

import com.tomtom.ordersystem.payment.model.Payment;
import com.tomtom.ordersystem.paymentgateway.api.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentGatewayController {

    @Autowired
    @Qualifier("DebitCardProcessor")
    private PaymentProcessor debitCardProcessor;

    @Autowired
    @Qualifier("GooglePayPaymentProcessor")
    private PaymentProcessor googlePayProcesssor;

    @RequestMapping(value = "/paymentgateway",method = RequestMethod.POST)
    public void processPayment(@RequestParam(value = "payment") final Payment payment) {

        System.out.println("Process payment");
    }
}
