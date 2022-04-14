package com.expo.messenger.controllers;


import com.expo.messenger.entities.Post;
import com.expo.messenger.entities.Post;
import com.expo.messenger.entities.Post;
import com.expo.messenger.models.request.PostDTO;
import com.expo.messenger.services.impl.PostServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostServiceImpl postService;

    @Autowired
    private ModelMapper modelMapper;


    @PostMapping("/add")
    public ResponseEntity<Post> addPost(@RequestBody PostDTO postDto){
        Post post = modelMapper.map(postDto, Post.class);
        return new ResponseEntity<>(postService.insertPost(post),HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Post>> getPosts(){
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public void getPostWithId(){

    }

    @PutMapping("/update")
    public void updatePost(){

    }

    @DeleteMapping("/delete")
    public void deletePost(){

    }

}
