package com.rahackya.ccassign.soapapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Author: Rajmani Arya
 * Date: 03 Jan 2017
 */

@WebService
public class UserService {
    private final static UserDao userDao = UserDao.getInstance();
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name="name") String name){
        if(name==null){
            return "Hello";
        }
        return "Hello "+ name;
    }

    @WebMethod(operationName = "showAll")
    public List<User> showAll(){
        return userDao.getAll();
    }

    @WebMethod(operationName = "show")
    public User show(@WebParam(name="id") Integer id){
        User user = userDao.get(id);
    	return user;
	}

    @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name="user") User user){
        
		return userDao.add(user);
    }

    @WebMethod(operationName = "editUser")
    public boolean editUser(@WebParam(name="id") Integer id, @WebParam(name="user") User user){
        return userDao.update(id, user);
    }

    @WebMethod(operationName = "destroyUser")
    public boolean destroyUser(@WebParam(name="id") Integer id){
        return userDao.destroy(id);
    }
}
