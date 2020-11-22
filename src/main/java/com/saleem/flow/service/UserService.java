package com.saleem.flow.service;

import java.util.List;

import com.saleem.flow.model.User;
import com.saleem.flow.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
