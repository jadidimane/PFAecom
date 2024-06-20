package com.example.pfaecom.service;

import com.example.pfaecom.dao.entities.Admin;
import com.example.pfaecom.dao.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminManager{
    @Autowired
    AdminRepository adminRepository;
    @Override
    public Admin register(Admin admin){
        return adminRepository.save(admin);
    }
}
