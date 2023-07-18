package com.example.mockito;
import java.util.List;

public interface UserDAO {

    User getUserByName(String name);
    List<User> findAllUsers();

}
