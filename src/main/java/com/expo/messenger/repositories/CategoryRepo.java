package com.expo.messenger.repositories;

import com.expo.messenger.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Integer> {
}
