package com.example.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {
    @Mock
    private UserDAO dao;
    @InjectMocks
    private UserService userService;

    @Test
    public void checkIfUserExistTrue() {
        when(dao.getUserByName("test")).thenReturn(new User("test"));
        boolean userExist = userService.checkUserExist(new User("test"));
        verify(dao, times(2)).getUserByName("test");
        assertTrue(userExist);
    }

    @Test
    public void checkIfUserExistFalse() {
        when(dao.getUserByName("test")).thenReturn(null);
        boolean userExist = userService.checkUserExist(
                new User("test"));
        assertFalse(userExist);
    }
}
