package com.expo.messenger.repositories;

import com.expo.messenger.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Integer> {
}
