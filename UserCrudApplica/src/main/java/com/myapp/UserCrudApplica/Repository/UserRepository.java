package com.myapp.UserCrudApplica.Repository;


import com.myapp.UserCrudApplica.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByLogin(String login);

}
