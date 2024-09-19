package com.erdemkaraaslan.springsecurity.services;

import com.erdemkaraaslan.springsecurity.dto.JwtAuthenticationResponse;
import com.erdemkaraaslan.springsecurity.dto.RefreshTokenRequest;
import com.erdemkaraaslan.springsecurity.dto.SignUpRequest;
import com.erdemkaraaslan.springsecurity.dto.SigninRequest;
import com.erdemkaraaslan.springsecurity.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
