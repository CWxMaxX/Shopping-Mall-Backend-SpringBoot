package com.testBackend.Test.Backend.App.service;


import com.testBackend.Test.Backend.App.entity.Admin;
import com.testBackend.Test.Backend.App.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional

public class AdminService {
    @Autowired
    private AdminRepo adminRepo;

    public Admin saveAdmin(Admin admin) {
        adminRepo.save(admin);
        return admin;
    }
}
