package com.nagarro.fotonet.dao.impl;

import java.util.List;

import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nagarro.fotonet.dao.UserDao;
import com.nagarro.fotonet.entity.User;

@Component
@Repository
public class UserDaoImpl extends AbstractGenericDao<User, Integer>
implements UserDao  {

    public User getUser(long subscriptionId) {
        String queryStr = "from User where subscription_id = :subscriptionId";
        Query query = em.createQuery(queryStr);
        query.setParameter("subscriptionId", subscriptionId);
        List<User> users = query.getResultList();
        User user = null;
        if (users !=null && !users.isEmpty()){
            if(users.size()>1) {
                throw new NonUniqueResultException("There are more than one user with given subscriptionId");
            }
            user = users.get(0);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
