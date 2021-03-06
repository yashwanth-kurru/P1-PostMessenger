package com.expo.messenger.controllers;

import com.expo.messenger.entities.Admin;
import com.expo.messenger.models.request.AdminDTO;
import com.expo.messenger.models.request.LoginRequestDTO;
import com.expo.messenger.services.impl.AdminServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminServiceImpl adminService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/login")
    public ResponseEntity<Admin> loginAdmin(@RequestBody LoginRequestDTO loginRequestDTO){
        String email = loginRequestDTO.getEmail();
        Admin admin = adminService.login(email);
        if(admin != null){
            return new ResponseEntity<>(admin, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<Admin> addAdmin(@RequestBody AdminDTO adminDto){
        Admin admin =  modelMapper.map(adminDto,Admin.class);
        return new ResponseEntity<>(adminService.insertAdmin(admin),HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Admin>> getAdmins(){
        return new ResponseEntity<>(adminService.getAllAdmins(), HttpStatus.OK) ;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Admin> getAdminWithId(@PathVariable Integer id){
        return new ResponseEntity<>(adminService.getAdminById(id),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Admin> updateAdmin(@RequestBody AdminDTO adminDTO){
        Admin admin = modelMapper.map(adminDTO,Admin.class);
        return new ResponseEntity<>(adminService.updateAdmin(admin),HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAdmin(@RequestBody AdminDTO adminDTO){
        log.info("Started to update");
        log.info(adminDTO.getAdminName()+" ==> "+adminDTO.getAdminId());
        Admin admin = modelMapper.map(adminDTO,Admin.class);
        adminService.deleteAdmin(admin);
        return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
    }



}
