package com.testBackend.Test.Backend.App.repo;

import com.testBackend.Test.Backend.App.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
