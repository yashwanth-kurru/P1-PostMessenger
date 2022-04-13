package com.expo.messenger.services.impl;

import com.expo.messenger.entities.Admin;
import com.expo.messenger.repositories.AdminRepo;
import com.expo.messenger.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public List<Admin> getAllAdmins(){
        return (List<Admin>) adminRepo.findAll();
    }

    public Admin insertAdmin(Admin admin){
        return this.adminRepo.save(admin);
    }

    public Admin updateAdmin(Admin admin)
    {
        return this.adminRepo.save(admin);
    }

    public Admin getAdminById(int id)
    {
       Optional<Admin> admin =  adminRepo.findById(id);
        return admin.orElse(null);
    }

}
