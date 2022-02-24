package com.testBackend.Test.Backend.App.service;

import com.testBackend.Test.Backend.App.entity.Payment;
import com.testBackend.Test.Backend.App.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    public Payment savePayment(Payment payment){
        paymentRepo.save(payment);

        return payment;
    }

}
