package com.myapp.UserCrudApplica.Service;

import com.myapp.UserCrudApplica.Entity.dto.UserDto;

import javax.xml.bind.ValidationException;

import static java.util.Objects.isNull;

public class UserServiceImpl {
    private void validateUserDto(UserDto usersDto) throws ValidationException {
        if (isNull(usersDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(usersDto.getName()) || usersDto.getName().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
    }
}
