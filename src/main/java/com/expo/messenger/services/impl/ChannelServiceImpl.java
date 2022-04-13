package com.expo.messenger.services.impl;

import com.expo.messenger.entities.Channel;
import com.expo.messenger.repositories.ChannelRepo;
import com.expo.messenger.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelRepo channelRepo;

    public List<Channel> getAllChannels(){
        return (List<Channel>) channelRepo.findAll();
    }

    public Channel insertChannel(Channel channel){
        return this.channelRepo.save(channel);
    }

    public Channel updateChannel(Channel channel)
    {
        return this.channelRepo.save(channel);
    }

}
