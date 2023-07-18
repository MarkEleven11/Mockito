package com.example.mockito;

import java.util.Arrays;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private final List<User> users;

    public UserDAOImpl() {
        this.users = Arrays.asList(
                new User("test12","test@test"),
                new User("test13","test@test1")
        );
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users){
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

}
