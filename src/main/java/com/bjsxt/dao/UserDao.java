package com.bjsxt.dao;

import com.bjsxt.pojo.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User selectUserById(String id);

    List<User> selectUserByName(String userName);

    List<User> selectUserBySql(String userName);

    List<User> selectUserByCriteria(String userName);

}
