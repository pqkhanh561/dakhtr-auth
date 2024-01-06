package com.dakhtr.auth.service;

import com.dakhtr.auth.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();

    UserDTO createUser(UserDTO user);
}
