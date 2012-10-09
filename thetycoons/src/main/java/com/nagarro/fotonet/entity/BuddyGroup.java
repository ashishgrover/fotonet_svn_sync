package com.nagarro.fotonet.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ashish1813
 */
@Entity
@Table(name="buddy_group")
public class BuddyGroup extends AbstractChangeableEntity{

    @ManyToOne
    @JoinTable(name="user_buddygroups",
        joinColumns=@JoinColumn(name="groupid"),
        inverseJoinColumns=@JoinColumn(name="userid"))
    private User owner;
    
    @Column(name="group_name")
    private String groupName;

    @ManyToMany
    @JoinTable(name="buddygroups_users",
        joinColumns=@JoinColumn(name="groupid"),
        inverseJoinColumns=@JoinColumn(name="memberid"))
    private Set<User> buddies;

    @ManyToMany
    @JoinTable(name="buddygroups_albums",
        joinColumns=@JoinColumn(name="groupid"),
        inverseJoinColumns=@JoinColumn(name="albumid"))
    private Set<Album> sharedAlbums;
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<User> getBuddies() {
        return buddies;
    }

    public void setBuddies(Set<User> buddies) {
        this.buddies = buddies;
    }

    public Set<Album> getSharedAlbums() {
        return sharedAlbums;
    }

    public void setSharedAlbums(Set<Album> sharedAlbums) {
        this.sharedAlbums = sharedAlbums;
    }

}
