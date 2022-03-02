package com.testBackend.Test.Backend.App.service;

import com.testBackend.Test.Backend.App.dto.AdminDTO;
import com.testBackend.Test.Backend.App.entity.Admin;
import com.testBackend.Test.Backend.App.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AdminService extends AdminDTO {

    @Autowired
    private AdminRepo adminRepo;

    public AdminService(Admin admin) {
        super(admin);
    }

    public AdminDTO loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepo.findByEmail(username);
        if (admin == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new AdminDTO(admin);
    }

}
