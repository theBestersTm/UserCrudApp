package com.myapp.UserCrudApplica.Entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
public class UserDto {
    private int id;

    private String name;

    private int age;

    private Date createDate;

    public String getName() {
        return name;
    }

}
