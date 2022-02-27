package com.testBackend.Test.Backend.App.repo;

import com.testBackend.Test.Backend.App.entity.ShoppingCartContains;
import com.testBackend.Test.Backend.App.entity.ShoppingCartContainsPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoppingCartContainsRepo extends JpaRepository <ShoppingCartContains, ShoppingCartContainsPK> {

    List<ShoppingCartContains> findAllByCartID(String cartID);

    void deleteByProductID(String productID);
    void deleteByCartID(String cartID);

}
