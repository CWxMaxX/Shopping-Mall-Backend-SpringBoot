package com.testBackend.Test.Backend.App.dto;

import com.testBackend.Test.Backend.App.entity.Admin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
public class AdminDTO implements UserDetails {

    private Admin admin;

    public AdminDTO(Admin admin) {
        this.admin = admin;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return Admin.getPassword();
    }

    @Override
    public String getUsername() {
        return Admin.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    public String getName() {
        return Admin.getName();
    }

}
