package com.nagarro.fotonet.services;

import com.nagarro.fotonet.entity.User;

public interface UserService {
    
    /**
     * This API returns user from the database having id received
     * 
     * @param id
     * @return
     */
    User getUserById(int id);
    
    /**
     * This API retrieves user from database.
     * @param userName User name
     * @return
     */
    User getUserBySubscriptionId(long subscriptionId);
    
    
    /**
     * This API checks for user with given name in internal user list via LDAP Or via open-id mechanism.
     * @param name
     * @return
     */
    boolean checkUser(String name);
    
    void createUser(String userName);
    
}
