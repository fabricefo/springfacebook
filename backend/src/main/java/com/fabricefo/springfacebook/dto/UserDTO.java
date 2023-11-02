package com.fabricefo.springfacebook.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import com.fabricefo.springfacebook.validator.ValidPassword;

@Data
@Builder
public class UserDTO {
    @Valid
    @Email(message = "Email is not valid")
    private String email;
    private String name;
    private String surname;
    @ValidPassword(message = "Too weak password")
    private String password;
}
