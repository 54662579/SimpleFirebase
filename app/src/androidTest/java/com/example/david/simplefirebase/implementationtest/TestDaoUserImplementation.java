package com.example.david.simplefirebase.implementationtest;

import android.support.test.runner.AndroidJUnit4;

import com.example.david.simplefirebase.dao.UserDao;
import com.example.david.simplefirebase.implementation.DaoUserImplementation;
import com.example.david.simplefirebase.model.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(AndroidJUnit4.class)
public class TestDaoUserImplementation {
    private User userOne;
    private User userTwo;
    private UserDao userDao;
    private String userOneFirstName = "Rick";
    private String userOneLastName = "Sanchez";
    private String userOneEmail = "rick.sanchez@hotmail.ca";
    private String userTwoFirstName = "Morty";
    private String userTwoLastName = "Smith";
    private String userTwoEmail = "morty.smith@hotmail.ca";

    @Before
    public void setUp() throws Exception{
        userDao = new DaoUserImplementation();

        userOne = new User();
        userTwo = new User();

        userOne.setFirstName(userOneFirstName);
        userOne.setLastName(userOneLastName);
        userOne.setEmail(userOneEmail);

        userTwo.setFirstName(userTwoFirstName);
        userTwo.setLastName(userTwoLastName);
        userTwo.setEmail(userTwoEmail);

    }

    @After
    public void tearDown() throws Exception{
        for(User user : selectAllUsers()){
            userDao.delete(user);
        }
    }

    @Test
    public void insertTest() throws Exception{

        userDao.insert(userOne);
        userDao.insert(userTwo);

        for(User user : selectAllUsers()){
            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            String email = user.getEmail();
        }

    }


    private List<User> selectAllUsers(){
        return userDao.select();
    }

}
