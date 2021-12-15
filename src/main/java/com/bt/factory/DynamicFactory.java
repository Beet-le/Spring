package com.bt.factory;

import com.bt.dao.UserDao;
import com.bt.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
