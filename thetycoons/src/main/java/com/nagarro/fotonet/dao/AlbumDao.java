/**
 * 
 */
package com.nagarro.fotonet.dao;

import java.util.List;

import com.nagarro.fotonet.entity.Album;

/**
 * @author shalini1814
 *
 */
public interface AlbumDao extends GenericDao<Album, Integer> {

    
    /**
     * Returns the list of names of all the albums uploaded by the user
     * 
     * @param userName
     * @return List of album names
     */
    List<Album> getAlbumsByUploader(int uploaderId);
}
