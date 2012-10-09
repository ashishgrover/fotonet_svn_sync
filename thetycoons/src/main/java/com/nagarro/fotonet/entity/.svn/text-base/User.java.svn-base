package com.nagarro.fotonet.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * This entity stores user information.
 * @author NSPL
 *
 */
@Entity
@Table(name="user")
public class User extends AbstractChangeableEntity {
    
    @Version
    private Integer version;
    
    @ManyToMany
    @JoinTable(name="buddygroup_users",
        joinColumns=@JoinColumn(name="memberid"),
        inverseJoinColumns=@JoinColumn(name="groupid"))
    private Set<BuddyGroup> memberBuddyGroups;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="subscription_id")
    private Integer subscriptionId;

    @Column(name="user_role")
    private String userRole;

    @OneToMany
    @JoinTable(name="user_buddygroups",
        joinColumns=@JoinColumn(name="userid"),
        inverseJoinColumns=@JoinColumn(name="groupid"))
    private Set<BuddyGroup> ownedbuddyGroups;

    @OneToMany
    @JoinTable(name="user_albums",
        joinColumns=@JoinColumn(name="userid"),
        inverseJoinColumns=@JoinColumn(name="albumid"))
    private Set<Album> ownedAlbums;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Set<BuddyGroup> getMemberBuddyGroups() {
		return memberBuddyGroups;
	}

	public void setMemberBuddyGroups(Set<BuddyGroup> memberBuddyGroups) {
		this.memberBuddyGroups = memberBuddyGroups;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Set<BuddyGroup> getOwnedbuddyGroups() {
		return ownedbuddyGroups;
	}

	public void setOwnedbuddyGroups(Set<BuddyGroup> ownedbuddyGroups) {
		this.ownedbuddyGroups = ownedbuddyGroups;
	}

	public Set<Album> getOwnedAlbums() {
		return ownedAlbums;
	}

	public void setOwnedAlbums(Set<Album> ownedAlbums) {
		this.ownedAlbums = ownedAlbums;
	}
    
    
}

