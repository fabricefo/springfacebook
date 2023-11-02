package com.fabricefo.springfacebook.controllers;

import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import com.fabricefo.springfacebook.dto.UserDTO;
import com.fabricefo.springfacebook.exceptions.EmailExistsException;
import com.fabricefo.springfacebook.exceptions.TooWeakPassword;
import com.fabricefo.springfacebook.services.RegisterService;

import java.io.IOException;

@RestController
@Validated
@RequestMapping("api/v2/register")
public class RegisterController {

    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }


    @PostMapping
    public ResponseEntity<String> register(@RequestBody @Valid UserDTO userDTO, Errors errors) throws EmailExistsException, MessagingException, IOException{
        if (errors.hasErrors()) {
            return new ResponseEntity(errors.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(registerService.register(userDTO));
    }


}
