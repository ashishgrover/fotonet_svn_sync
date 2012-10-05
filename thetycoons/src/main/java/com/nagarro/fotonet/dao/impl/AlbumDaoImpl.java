package com.nagarro.fotonet.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nagarro.fotonet.dao.AlbumDao;
import com.nagarro.fotonet.entity.Album;

/**
 * @author shalini1814
 * 
 */
@Component
@Repository
public class AlbumDaoImpl extends AbstractGenericDao<Album, Integer> implements
        AlbumDao {


    public List<Album> getAlbumsByUploader(int uploaderId) {
        
        String queryStr = "from Album where uploaderId = :uploaderId";
        Query query = em.createQuery(queryStr);
        query.setParameter("uploaderId", uploaderId);
        List<Album> albums = query.getResultList();
        
        return albums;
    }

    @Override
    public List<Album> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
}
