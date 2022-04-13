package com.expo.messenger.controllers;


import com.expo.messenger.entities.Channel;
import com.expo.messenger.repositories.ChannelRepo;
import com.expo.messenger.services.impl.ChannelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/channel")
public class ChannelController {

    @Autowired
    private ChannelServiceImpl channelService;

    @PostMapping("/add")
    public void addChannel(@RequestBody Channel channel){

    }

    @GetMapping("/get")
    public ResponseEntity<List<Channel>> getChannels(){
        return new ResponseEntity<>(this.channelService.getAllChannels(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public void getChannelWithId(){

    }

    @PutMapping("/update")
    public void updateChannel(){

    }

    @DeleteMapping("/delete")
    public void deleteChannel(){

    }

}
