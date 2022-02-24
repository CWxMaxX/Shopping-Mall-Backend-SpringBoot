package com.testBackend.Test.Backend.App.controller;

import com.testBackend.Test.Backend.App.entity.Payment;
import com.testBackend.Test.Backend.App.service.AdminService;
import com.testBackend.Test.Backend.App.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/payment")
@CrossOrigin
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

      @PostMapping("/savePayment")
    public Payment savePayment(@RequestBody Payment payment){
          return paymentService.savePayment(payment);
      }
}
