package com.bt.test;

import com.bt.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        //强转
      /*  UserDao userDao1 = (UserDao) app.getBean("userDao");
        UserDao userDao2 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);*/
        UserDao userDao = (UserDao) app.getBean("userDao");
        System.out.println(userDao);
//        app.close();
    }

}
