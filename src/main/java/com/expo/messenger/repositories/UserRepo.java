package com.expo.messenger.repositories;

import com.expo.messenger.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
}
