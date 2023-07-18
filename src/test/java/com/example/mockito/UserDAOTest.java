package com.example.mockito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UserDAOTest {

    private final UserDAO dao = new UserDAOImpl();

    @Test
    public void testUserByUserName(){
        User user = dao.getUserByName("test11");
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(), "test11");
    }
    @Test
    public void testUserByUserNameIsNull(){
        Assertions.assertNull(dao.getUserByName("somebody"));
    }

}
