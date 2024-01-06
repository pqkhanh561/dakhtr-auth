package com.dakhtr.auth.models.interfaces;

import com.dakhtr.auth.models.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
//        User testUser = new User("Test",
//                "User",
//                "123",
//                "test@user",
//                true,
//                new Date(System.currentTimeMillis()),
//                "test",
//                "test",
//                new Date(System.currentTimeMillis())
//                );
//        userRepository.save(testUser);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void findByLastName() {
    }

    @Test
    void findById() {
    }
}