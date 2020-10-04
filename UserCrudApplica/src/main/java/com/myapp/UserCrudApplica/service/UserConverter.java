package com.myapp.UserCrudApplica.service;

import com.myapp.UserCrudApplica.entity.User;
import com.myapp.UserCrudApplica.entity.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserConverter {

    public User fromUserDtoToUser(UserDto usersDto) {
        User users = new User();
        users.setId(usersDto.getId());
        users.setAge(usersDto.getId());
        users.setName(usersDto.getName());
        users.setCreateDate(usersDto.getCreateDate());
        return users;
    }

    public UserDto fromUserToUserDto(User users) {
        return UserDto.builder()
                .id(users.getId())
                .age(users.getAge())
                .createDate(users.getCreateDate())
                .name(users.getName())
                .build();
    }
}