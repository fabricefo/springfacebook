package com.fabricefo.springfacebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fabricefo.springfacebook.models.ImageData;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {


    Optional<ImageData> findByName(String fileName);
}