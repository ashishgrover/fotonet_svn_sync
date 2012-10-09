/**
 * 
 */
package com.nagarro.fotonet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author shalini1814
 *
 */
@Entity
@Table(name="tag")
public class Tag extends AbstractChangeableEntity {
    
    @ManyToMany
    @JoinTable(name="photo_tags",
        joinColumns=@JoinColumn(name="tagid"),
        inverseJoinColumns=@JoinColumn(name="photoid"))
    private Photo photo;

    @Version
    private Integer version;
    
    @Column(name="content")
    private String content;

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}