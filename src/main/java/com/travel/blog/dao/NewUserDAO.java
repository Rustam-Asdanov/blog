package com.travel.blog.dao;

import com.travel.blog.model.NewUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewUserDAO {

    private Connection conn;

    public List<NewUser> getListUsers(){

        List<NewUser> userList = new ArrayList<>();

        String query = "select * from new_user";
        try {
            ResultSet resultSet = conn.createStatement().executeQuery(query);
            while(resultSet.next()){
                userList.add(
                        new NewUser(
                                resultSet.getInt("id"),
                                resultSet.getString("full_name"),
                                resultSet.getString("password"),
                                resultSet.getString("mail")
                        )
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }

    public void addNewUser(NewUser newUser){
        String query = String.format(
                "insert into new_user values(null,'%s','%s','%s');",
                newUser.getFull_name(),
                newUser.getPassword(),
                newUser.getEmail()
        );

        try {
            conn.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
