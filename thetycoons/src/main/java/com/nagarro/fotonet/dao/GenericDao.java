package com.nagarro.fotonet.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

public interface GenericDao<T, ID extends Serializable> {
    
    T findById(ID id);
    
    T getReference(ID id);
    
    List<T> findAll();
    
    T makePersistent(T entity, boolean mergeDetached);
    
    void makeTransient(T entity);
    
    Criteria createCriteria();
    
}
