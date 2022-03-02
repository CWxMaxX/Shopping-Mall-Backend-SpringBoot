package com.testBackend.Test.Backend.App.repo;

import com.testBackend.Test.Backend.App.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Admin, String> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public Admin findByEmail(String email);

}
