package com.testBackend.Test.Backend.App.repo;

import com.testBackend.Test.Backend.App.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepo extends JpaRepository<ShoppingCart,String> {
}
