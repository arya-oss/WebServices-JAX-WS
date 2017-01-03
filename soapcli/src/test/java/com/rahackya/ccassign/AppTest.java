package com.rahackya.ccassign;

import com.rahackya.ccassign.soapapp.User;
import com.rahackya.ccassign.soapapp.UserService;
import com.rahackya.ccassign.soapapp.UserServiceService;
import junit.framework.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testApp() {
        UserServiceService userServiceService = new UserServiceService();
        UserService userService = userServiceService.getUserServicePort();
        Assert.assertNotNull(userService.sayHello("Arya"));
        Assert.assertNotNull(userService.showAll());
        Assert.assertNotNull(userService.show(1));
//        User user =new User();
//        user.setRollno(137144);
//        user.setName("Prashant Mishra");
//        user.setEmail("pmishra@gmail.com");
//        user.setPhone("8478478247");
//        user.setCompany("Amazon");
//        Assert.assertTrue(userService.addUser(user));
    }
}
