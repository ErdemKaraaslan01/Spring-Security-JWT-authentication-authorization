package com.erdemkaraaslan.springsecurity.dto;

import lombok.Data;

@Data
public class SigninRequest {

    private String email;
    private String password;


}
