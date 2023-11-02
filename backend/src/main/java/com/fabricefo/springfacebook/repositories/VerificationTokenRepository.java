package com.fabricefo.springfacebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fabricefo.springfacebook.models.User;
import com.fabricefo.springfacebook.models.VerificationToken;

import java.util.Optional;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    Optional<VerificationToken> findByToken(String token);
}