package com.bt.dao.impl;

import com.bt.dao.UserDao;
//Bean实例化三种方式
//无参构造方法实例化
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建");
    }
    public void init(){
        System.out.println("初始化方法");
    }
    public void distory(){
        System.out.println("销毁方法");
    }

    @Override
    public void save() {
        System.out.println("save r");
    }
}
