package com.fabricefo.springfacebook.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fabricefo.springfacebook.models.Post;
import com.fabricefo.springfacebook.models.User;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAll();

    List<Post> findPostByCreator(User user);
}
