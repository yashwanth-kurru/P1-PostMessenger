package com.expo.messenger.models.request;

import com.expo.messenger.entities.Channel;
import lombok.Data;

@Data
public class UserDTO {

    private int userId;
    private String userName;
    private Channel channel;

}
