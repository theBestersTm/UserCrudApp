package com.myapp.UserCrudApplica.Controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
@NoArgsConstructor
public class UserController {
    @GetMapping
    public String GetUser() {
        return "index";
    }
}
