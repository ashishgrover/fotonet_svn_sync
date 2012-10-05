package com.nagarro.fotonet.dao;

import javax.persistence.NonUniqueResultException;

import com.nagarro.fotonet.entity.User;

/**
 * @author shalini1814
 *
 */
public interface UserDao extends 
GenericDao<User,Integer> {
    
    /**
     * This API checks for user with given subscriptionId.
     * @param subscriptionId
     * @return
     */
    User getUser(long subscriptionId) throws NonUniqueResultException;
}
