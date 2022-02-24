package com.testBackend.Test.Backend.App.repo;

import com.testBackend.Test.Backend.App.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository <Admin,String> {
}
