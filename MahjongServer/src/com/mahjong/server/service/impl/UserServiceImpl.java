package com.mahjong.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahjong.server.dao.UserDao;
import com.mahjong.server.model.User;
import com.mahjong.server.service.UserService;
/**
 * 
 * @author Simple
 * @date 2013-3-28 下午03:33:13
 * @Description TODO
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  public User login(String username, String password) {
    // TODO Auto-generated method stub
    return userDao.login(username, password);
  }

  public void save(User user) {
    // TODO Auto-generated method stub
    userDao.save(user);
  }

  public List<User> getAllUser() {
    return userDao.getAllUser();
  }
}
