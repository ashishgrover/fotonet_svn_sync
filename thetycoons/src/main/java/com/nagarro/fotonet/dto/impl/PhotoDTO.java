package com.nagarro.fotonet.dto.impl;

import com.nagarro.fotonet.dto.ItemDTO;

/**
 * @author shalini1814
 *
 */
public class PhotoDTO implements ItemDTO {

    private String photoName;
    private int uploaderId;
    private String path;
    
    public String getPhotoName() {
        return photoName;
    }
    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
    public int getUploaderId() {
        return uploaderId;
    }
    public void setUploaderId(int uploaderId) {
        this.uploaderId = uploaderId;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
}
