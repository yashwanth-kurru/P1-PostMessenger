package com.expo.messenger.controllers;


import com.expo.messenger.entities.Category;
import com.expo.messenger.entities.Channel;
import com.expo.messenger.models.request.ChannelDTO;
import com.expo.messenger.repositories.ChannelRepo;
import com.expo.messenger.services.impl.ChannelServiceImpl;
import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/add")
    public ResponseEntity<Channel> addChannel(@RequestBody ChannelDTO channelDto){
        Channel channel = modelMapper.map(channelDto, Channel.class);
        return new ResponseEntity<>(channelService.insertChannel(channel),HttpStatus.OK);
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
