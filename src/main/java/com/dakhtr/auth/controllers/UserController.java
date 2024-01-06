package com.dakhtr.auth.controllers;

import com.dakhtr.auth.dtos.UserDTO;
import com.dakhtr.auth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userRequest) {
        return ResponseEntity.ok(userService.createUser(userRequest));
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAll();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
