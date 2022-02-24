package com.testBackend.Test.Backend.App.repo;

import com.testBackend.Test.Backend.App.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,String> {
}
