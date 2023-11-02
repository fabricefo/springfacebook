package com.fabricefo.springfacebook.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fabricefo.springfacebook.models.Group;

import java.util.List;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long>
{
    public List<Group> findAll();
}
