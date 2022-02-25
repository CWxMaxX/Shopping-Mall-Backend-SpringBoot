package com.testBackend.Test.Backend.App.repo;

import com.testBackend.Test.Backend.App.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository <User, String> {

}
