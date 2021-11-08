package com.travel.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "new_user")
@AllArgsConstructor
@Data
@Valid
public class NewUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    @Size(min = 3)
    private String full_name;

    @Size(min = 8)
    private String password;

    @NotEmpty
    private String email;

    public NewUser() {
    }
}
