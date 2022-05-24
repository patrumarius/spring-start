package com.example.restservices.service;

import com.example.restservices.exceptions.NotEnoughMoneyException;
import com.example.restservices.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
