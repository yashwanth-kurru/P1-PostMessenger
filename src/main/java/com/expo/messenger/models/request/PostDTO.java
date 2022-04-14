package com.expo.messenger.models.request;

import com.expo.messenger.entities.Admin;
import com.expo.messenger.entities.Category;
import com.expo.messenger.entities.Channel;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PostDTO {

    private int postId;
    private String title;
    private String message;
    private Date createdAt;
    private Category category;
    private Admin admin;
    private List<Channel> channels;

}
