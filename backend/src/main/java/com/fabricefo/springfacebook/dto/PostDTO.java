package com.fabricefo.springfacebook.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fabricefo.springfacebook.models.User;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private String title;
    private String description;
    private User creator;
}
