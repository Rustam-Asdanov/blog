package com.travel.blog.service;

import com.travel.blog.dao.NewUserDAO;
import com.travel.blog.model.NewUser;
import com.travel.blog.repsitory.NewUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewUserService {

    private NewUserRepository newUserRepository;

    public NewUserService(NewUserRepository newUserRepository) {
        this.newUserRepository = newUserRepository;
    }

    public List<NewUser> getUser(){
        return newUserRepository.findAll();
    }

    public void addUser(NewUser newUser){
        newUserRepository.save(newUser);
    }

}
