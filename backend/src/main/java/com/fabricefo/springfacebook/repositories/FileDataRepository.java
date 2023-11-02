package com.fabricefo.springfacebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fabricefo.springfacebook.models.FileData;
import com.fabricefo.springfacebook.models.User;


import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData,Long> {
    Optional<FileData> findByName(String fileName);
    Optional<FileData> findByUser(User user);

    Optional<FileData> findById(Long id);
}