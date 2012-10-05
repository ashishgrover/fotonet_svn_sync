/**
 * 
 */
package com.nagarro.fotonet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.web.multipart.commons.CommonsMultipartFile;


/**
 * @author shalini1814
 *
 */
@Entity
@Table(name="photo")
public class Photo extends AbstractChangeableEntity {

    
    @Column(name="photo_name")
    private String photoName;
    
    @ManyToOne
    private User uploader;
    
    @Column(name="path")
    private String path;

    @Version
    private Integer version;

    private transient CommonsMultipartFile fileData;
    
    public Photo() {}
    
    public Photo(String photoName, User uploader, Date createdOn) {
        this.photoName = photoName;
        this.uploader = uploader;
        this.createdOn = createdOn;
    }
    
    public Photo(String photoName, User uploader, String path, Integer version, Date createdOn) {
        this.photoName = photoName;
        this.uploader = uploader;
        this.path = path;
        this.version = version;
        this.createdOn = createdOn;
    }
    
    public User getUploader() {
        return uploader;
    }

    public void setUploader(User uploader) {
        this.uploader = uploader;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

	public CommonsMultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}
    
}
