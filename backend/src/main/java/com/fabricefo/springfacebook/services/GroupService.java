package com.fabricefo.springfacebook.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fabricefo.springfacebook.dto.GroupDTO;
import com.fabricefo.springfacebook.models.Group;

import com.fabricefo.springfacebook.repositories.GroupRepository;
import com.fabricefo.springfacebook.repositories.UserRepository;

import java.util.List;


@Service
public class GroupService {
    public static final String GROUP_NOT_FOUND = "Group with id %s was not found.";
    private final GroupRepository groupRepository;

    private final UserRepository userRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository, UserRepository userRepository) {
        this.groupRepository = groupRepository;
        this.userRepository = userRepository;
    }

    public List<Group> getAllGroup() {
        return groupRepository.findAll();
    }

    public Group getGroupById(Long id) {
        return groupRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format(GROUP_NOT_FOUND, id)));
    }

    @Transactional
    public void deleteGroupById(Long id) {
        groupRepository.deleteById(id);
    }

    @Transactional
    public void addGroup(GroupDTO groupDTO) {
        var group = Group.builder()
                .name(groupDTO.getName())
                .description(groupDTO.getDescription())
                .build();

        groupRepository.save(group);
    }

    public void updateGroup(Long id, GroupDTO groupDTO) {
        groupRepository.findById(id).map(group -> {
            group.setName(groupDTO.getName());
            group.setDescription(groupDTO.getDescription());
            return groupRepository.save(group);
        }).orElseThrow(() -> new RuntimeException(String.format(GROUP_NOT_FOUND, id)));
    }


}
