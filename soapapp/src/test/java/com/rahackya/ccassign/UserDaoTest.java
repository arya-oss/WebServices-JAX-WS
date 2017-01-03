package com.rahackya.ccassign;

import com.rahackya.ccassign.soapapp.UserDao;
import junit.framework.Assert;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class UserDaoTest {
    @Test
    public void testApp() {
        UserDao userDao = UserDao.getInstance();
        Assert.assertNotNull(userDao.get(1));
    }
}
