package com.expo.messenger.controllers;


import com.expo.messenger.entities.*;
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

    @GetMapping("/get-by-category/{id}")
    public ResponseEntity<List<Post>> getPostsByCategory(@PathVariable int id){
        Category category = new Category();
        category.setCategoryId(id);
        return new ResponseEntity<>(postService.getAllPostsByCategory(category),HttpStatus.OK);
    }

    @GetMapping("/get-by-channel/{id}")
    public ResponseEntity<List<Post>> getPostsByChannel(@PathVariable int id){
        Channel channel = new Channel();
        channel.setChannelId(id);
        return new ResponseEntity<>(postService.getAllPostsByChannel(channel),HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletePost(@RequestBody PostDTO postDTO){
        Post post = modelMapper.map(postDTO, Post.class);
        postService.deletePost(post);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
