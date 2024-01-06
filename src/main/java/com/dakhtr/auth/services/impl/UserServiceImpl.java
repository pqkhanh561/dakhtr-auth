package com.dakhtr.auth.services.impl;

import com.dakhtr.auth.dtos.UserDTO;
import com.dakhtr.auth.models.User;
import com.dakhtr.auth.models.interfaces.UserRepository;
import com.dakhtr.auth.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserDTO> getAll() {
        Iterable<User> users = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        Iterator<User> userIterator = users.iterator();
        while (userIterator.hasNext()) {
            userDTOList.add(modelMapper.map(userIterator.next(), UserDTO.class));
        }
        return userDTOList;
    }

    @Override
    public UserDTO createUser(UserDTO user) {
        User createdUser = modelMapper.map(user, User.class);
        createdUser.setCreatedOn(new Date(System.currentTimeMillis()));
        //TODO: AuthenticationFacade
        createdUser.setCreatedBy("0");
        createdUser.setUpdatedBy("0");
        createdUser.setCreatedOn(new Date(System.currentTimeMillis()));
        return modelMapper.map(userRepository.save(createdUser), UserDTO.class);
    }
}
