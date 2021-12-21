package com.bt.service.impl;

import com.bt.dao.UserDao;
import com.bt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

  /*  public UserServiceImpl() {
    }*/

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /* public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
       UserDao userDao = (UserDao) app.getBean("userDao");
       userDao.save();
    }
}
