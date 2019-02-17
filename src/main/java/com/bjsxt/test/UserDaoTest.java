package com.bjsxt.test;

import com.bjsxt.dao.UserDao;
import com.bjsxt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSave(){
        User user = new User();
        user.setAge("333");
        user.setUsername("333");
        user.setPassword("333");
        userDao.saveUser(user);
        System.out.println("as");
    }

    @Test
    public void testUpdate() {
        User user=new User();
        user.setId("3");
        user.setAge("32");
        user.setPassword("saaa");
        user.setUsername("user3");
        userDao.updateUser(user);
    }

    @Test
    public void testDelete(){
        User user=new User();
        user.setId("3");
        userDao.deleteUser(user);
    }

    @Test
    public void testSelect(){
        User user=userDao.selectUserById("5");
        System.out.println(user.toString());
    }

    @Test
    public void testSelHql(){
        List<User> userList=userDao.selectUserByName("sasa");
        for(User user:userList){
            System.out.println(user.toString());
        }
    }

    @Test
    public void testSelSql(){
        List<User> userList=userDao.selectUserBySql("sasa");
        for(User user:userList){
            System.out.println(user.toString());
        }
    }

    @Test
    public void testSelCriteria(){
        List<User> userList=userDao.selectUserByCriteria("sasa");
        for(User user:userList){
            System.out.println(user.toString());
        }
    }
}

