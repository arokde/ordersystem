package com.tomtom.ordersystem.paymentgateway.service;

import com.tomtom.ordersystem.paymentgateway.api.PaymentProcessor;
import org.springframework.stereotype.Service;

@Service("GooglePayPaymentProcessor")
public class GooglePayPaymentProcessor implements PaymentProcessor {


    @Override
    public void applyPayment() {

    }
}
