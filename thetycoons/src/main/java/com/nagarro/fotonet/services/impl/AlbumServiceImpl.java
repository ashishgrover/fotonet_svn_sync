package com.nagarro.fotonet.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.fotonet.dao.AlbumDao;
import com.nagarro.fotonet.entity.Album;
import com.nagarro.fotonet.services.AlbumService;

/**
 * 
 * @author shalini1814
 *
 */
@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDao albumDao;
    
    @Override
    public Album getAlbumById(int id) {
        return albumDao.findById(id);
    }
    
    @Override
    public List<Album> getAlbumsByUploader(int userId) {
        return albumDao.getAlbumsByUploader(userId);
    }
    
    public AlbumDao getAlbumDao() {
        return albumDao;
    }

    public void setAlbumDao(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

}
