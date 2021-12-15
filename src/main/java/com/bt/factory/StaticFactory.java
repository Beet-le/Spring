package com.bt.factory;

import com.bt.dao.UserDao;
import com.bt.dao.impl.UserDaoImpl;
// 工厂静态方法实例化
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
