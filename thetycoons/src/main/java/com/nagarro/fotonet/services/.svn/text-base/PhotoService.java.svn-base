/**
 * 
 */
package com.nagarro.fotonet.services;

import java.util.List;

import com.nagarro.fotonet.entity.Photo;
import com.nagarro.fotonet.entity.User;

/**
 * @author shalini1814
 *
 */
public interface PhotoService {

    /**
     * This API returns the Photo from the database having the received id
     * @param id
     * @return
     */
    Photo getPhotoById(int id);
    /**
     * 
     * @param albumId
     * @return
     */
    List<Photo> getPhotosInAlbum(int albumId);
    
    /**
     * 
     * @param userName
     * @return
     */
    List<Photo> getPhotosByUploader(User uploader);
    
    /**
     * 
     */
    void uploadPhoto(Photo path);
    
}
