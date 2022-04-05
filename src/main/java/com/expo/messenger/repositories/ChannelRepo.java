package com.expo.messenger.repositories;

import com.expo.messenger.entities.Channel;
import org.springframework.data.repository.CrudRepository;

public interface ChannelRepo extends CrudRepository<Channel, Integer> {
}
