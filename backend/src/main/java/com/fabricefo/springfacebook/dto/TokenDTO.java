package com.fabricefo.springfacebook.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fabricefo.springfacebook.models.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDTO {
    private String token;
    private String message;

    private Role role;
}
