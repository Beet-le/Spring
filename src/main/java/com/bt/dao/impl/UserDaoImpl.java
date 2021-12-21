package com.bt.dao.impl;

import com.bt.dao.UserDao;
import com.bt.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;


//Bean实例化三种方式
//无参构造方法实例化
public class UserDaoImpl implements UserDao {

   private List<String> strlist;
   private Map<String, User> userMap;
   private Properties properties;

    public void setStrlist(List<String> strlist) {
        this.strlist = strlist;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String username;
    private int age;
    public void setUsername(String username) {
        this.username = username;
    }



    public void setAge(int age) {
        this.age = age;
    }

    /*  public UserDaoImpl() {
            System.out.println("UserDaoImpl创建");
        }
        public void init(){
            System.out.println("初始化方法");
        }
        public void distory(){
            System.out.println("销毁方法");
        }
    */
    @Override
    public void save() {
//        System.out.println(username+"===="+age);
        System.out.println(strlist);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save runing");
    }
}
