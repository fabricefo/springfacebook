package com.fabricefo.springfacebook.repositories;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fabricefo.springfacebook.models.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
     List<User> findAll();

     Optional<User> findByEmail(String email);

     boolean existsByEmail(String email);

     List<User> findFirst10ByOrderByIdAsc();

     Optional<User> getUserById(Long userId);



}