package com.travel.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewUser {

    private long id;
    private String full_name;
    private String password;
    private String mail;

    public NewUser() {
    }
}
