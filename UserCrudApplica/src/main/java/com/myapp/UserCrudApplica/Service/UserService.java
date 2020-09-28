package com.myapp.UserCrudApplica.Service;

import com.myapp.UserCrudApplica.Entity.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto usersDto);

    void deleteUser(Integer userId);

    UserDto findByLogin(String login);

    List<UserDto> findAll();
}
