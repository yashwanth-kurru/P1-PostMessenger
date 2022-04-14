package com.expo.messenger.services.impl;

import com.expo.messenger.entities.Post;
import com.expo.messenger.repositories.PostRepo;
import com.expo.messenger.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;

    public Post insertPost(Post post){
        return postRepo.save(post);
    }

    public List<Post> getAllPosts()
    {
        return (List<Post>) postRepo.findAll();
    }
}
