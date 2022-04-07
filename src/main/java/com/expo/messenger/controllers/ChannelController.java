package com.expo.messenger.controllers;


import com.expo.messenger.entities.Channel;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChannelController {

    @PostMapping("/")
    public void addChannel(@RequestBody Channel channel){

    }

    @GetMapping("/")
    public void getChannelWithId(){

    }

    @PutMapping("/")
    public void updateChannel(){

    }

    @DeleteMapping("/")
    public void deleteChannel(){

    }

}
