package com.expo.messenger.repositories;

import com.expo.messenger.entities.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin,Integer> {
    public Admin findByEmail(String email);
}
