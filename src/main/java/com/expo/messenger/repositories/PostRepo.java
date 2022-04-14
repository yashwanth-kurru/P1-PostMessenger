package com.expo.messenger.repositories;

import com.expo.messenger.entities.Category;
import com.expo.messenger.entities.Channel;
import com.expo.messenger.entities.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post,Integer> {

    public List<Post> findAllByCategory(Category category);
    public List<Post> findAllByChannels(Channel channel);

}
