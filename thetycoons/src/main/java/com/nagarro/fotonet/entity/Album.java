/**
 * 
 */
package com.nagarro.fotonet.entity;

import java.util.Set;

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
@Table(name="album")
public class Album extends AbstractChangeableEntity {
    
    @ManyToOne
    @JoinTable(name="user_albums",
        joinColumns=@JoinColumn(name="albumid"),
        inverseJoinColumns=@JoinColumn(name="userid"))
    private User user;
    
    @ManyToMany
    @JoinTable(name="buddygroups_albums",
        joinColumns=@JoinColumn(name="albumid"),
        inverseJoinColumns=@JoinColumn(name="groupid"))
    private Set<BuddyGroup> sharedWithGroup;

    @Column(name="name")
    private String albumName;
   
    @Version
    private Integer version;

    @Column(name="published")
    private Boolean published;

    @Column(name="sharing_status")
    private String sharingStatus;

    @OneToOne
    private Photo coverPhoto;

    @ManyToMany
    @JoinTable(name="album_photos",
        joinColumns=@JoinColumn(name="albumid"),
        inverseJoinColumns=@JoinColumn(name="photoid"))
    private Set<Photo> photos;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<BuddyGroup> getSharedWithGroup() {
		return sharedWithGroup;
	}

	public void setSharedWithGroup(Set<BuddyGroup> sharedWithGroup) {
		this.sharedWithGroup = sharedWithGroup;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Boolean getPublished() {
		return published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	public String getSharingStatus() {
		return sharingStatus;
	}

	public void setSharingStatus(String sharingStatus) {
		this.sharingStatus = sharingStatus;
	}

	public Photo getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(Photo coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public Set<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(Set<Photo> photos) {
		this.photos = photos;
	}

    
}
