package com.tomtom.ordersystem.paymentgateway.service;

import com.tomtom.ordersystem.paymentgateway.api.PaymentProcessor;
import org.springframework.stereotype.Service;

@Service("DebitCardProcessor")
public class DebitCardPaymentProcessor implements PaymentProcessor {


    @Override
    public void applyPayment() {
        System.out.println("Perform debit card related payment processing");
    }
}
