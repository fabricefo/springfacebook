package com.fabricefo.springfacebook.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProfilePicture {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true)
    private String path;

}
