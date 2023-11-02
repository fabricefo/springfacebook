package com.fabricefo.springfacebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fabricefo.springfacebook.dto.LoginDTO;
import com.fabricefo.springfacebook.dto.RefreshTokenDTO;
import com.fabricefo.springfacebook.dto.TokenDTO;
import com.fabricefo.springfacebook.services.LoginService;

@RestController
@RequestMapping("api/v2")
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<TokenDTO> login(@RequestBody LoginDTO LoginDTO){return loginService.authenticate(LoginDTO);}


    @GetMapping("/refreshtoken")
    public ResponseEntity<RefreshTokenDTO> refreshToken(){
        return loginService.refreshTokenDTOResponseEntity();
    }

}
