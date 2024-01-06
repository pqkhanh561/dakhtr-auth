package com.dakhtr.auth.services;

import com.dakhtr.auth.dtos.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();

    UserDTO createUser(UserDTO user);
}
