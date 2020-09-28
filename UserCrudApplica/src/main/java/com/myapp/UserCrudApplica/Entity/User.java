package com.myapp.UserCrudApplica.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @Column
    private String name;
    @Column
    private int age;
    @Column
    private Date createDate;
}
