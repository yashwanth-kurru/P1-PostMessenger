package com.expo.messenger.models.request;

import lombok.Data;

@Data
public class AdminDTO {
    private int adminId;
    private String adminName;
    private String email;
    private String password;

}
