package com.nagarro.fotonet.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.ejb.HibernateEntityManager;

import com.nagarro.fotonet.dao.GenericDao;

public abstract class AbstractGenericDao<T, ID extends Serializable> 
implements GenericDao<T, ID> {

    @PersistenceContext
    protected EntityManager em;
    
    private Class<T> persistentClass;
    
    public Class<T> getPersistentClass() {
        if(persistentClass == null) {
            persistentClass = (Class<T>)
            ( (ParameterizedType) getClass().getGenericSuperclass() )
            .getActualTypeArguments()[0];
        }
        return persistentClass;
    }
    
    public T findById(ID id) {
        return em.find(getPersistentClass(), id);
    };

    
    @Override
    public T getReference(ID id){
        return em.getReference(getPersistentClass(), id);
    }
    
    @Override
    public T makePersistent(T entity, boolean mergeDetached) {
        if(mergeDetached) {
            entity = em.merge(entity);
        } else {
            em.persist(entity);
        }
        return entity;
    }
    
    public void makeTransient(T entity) {
        em.remove(entity);
    }
    
    public void flush() {
        em.flush();
    }
    
    public void clear() {
        em.clear();
    }
    
    
    @Override
    public List<T> findAll() {
        return findByCriteria();
    }
    
    protected List<T> findByQuery(String queryStr) {
        return findByQuery(queryStr, null);
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> findByQuery(String queryStr, Map<String,Object> parameters) {
        Query query = em.createQuery(queryStr);
        if(parameters != null){
            for(String key: parameters.keySet()) {
                query.setParameter(key, parameters.get(key));
            }
        }
        return query.getResultList();
    }
    
    
    @SuppressWarnings("unchecked")
    protected List<T> findByCriteria(Criterion... criterion) {
        HibernateEntityManager hibEM =
            (HibernateEntityManager) em;
        Criteria crit =    hibEM.getSession().createCriteria(getPersistentClass());
        for (Criterion c : criterion) {
            crit.add(c);
        }
        return crit.list();
    }
    
    public Criteria createCriteria() {
        HibernateEntityManager hibEM =
            (HibernateEntityManager) em;
        return    hibEM.getSession().createCriteria(getPersistentClass());
    }

    protected EntityManager getEM() {
        return em;
    }



}
