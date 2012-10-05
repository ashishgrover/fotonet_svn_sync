/**
 * 
 */
package com.nagarro.fotonet.dao;

import java.util.List;

import com.nagarro.fotonet.entity.Photo;
import com.nagarro.fotonet.entity.User;

/**
 * @author shalini1814
 *
 */
public interface PhotoDao extends GenericDao<Photo, Integer> {

    /**
     * Returns all the photos in an album having id = albumId
     * 
     * @param albumId
     * @return List of paths of photos
     */
    List<Photo> getPhotosInAlbum(int albumId);
    
    /**
     * Returns all the photos uploaded by the user
     * 
     * @param userName
     * @return List of photos
     */
    List<Photo> getPhotosByUploader(User uploader);
}
