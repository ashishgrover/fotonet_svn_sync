package com.nagarro.fotonet.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nagarro.fotonet.dao.PhotoDao;
import com.nagarro.fotonet.entity.Photo;
import com.nagarro.fotonet.entity.User;
import com.nagarro.fotonet.services.UserService;

/**
 * @author shalini1814
 * 
 */
@Component
@Repository
public class PhotoDaoImpl extends AbstractGenericDao<Photo, Integer> implements
        PhotoDao {
    
    public List<Photo> getPhotosInAlbum(int albumId) {
        
        String queryStr = "from Photo where albumId = :albumId";
        Query query = em.createQuery(queryStr);
        query.setParameter("albumId", albumId);
        List<Photo> photos = query.getResultList();
        
        return photos;
    }

    public List<Photo> getPhotosByUploader(User uploader) {
        
        String queryStr = "from Photo where uploader = :uploader";
        Query query = em.createQuery(queryStr);
        query.setParameter("uploader", uploader);
        List<Photo> photos = query.getResultList();
        
        return photos;
    }

    @Override
    public List<Photo> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
}
