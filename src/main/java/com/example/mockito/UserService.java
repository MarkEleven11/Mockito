package com.example.mockito;

public class UserService {

    private final UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }
    public boolean checkUserExist(User user){
        return dao.getUserByName(user.getName()) != null;
    };
}
