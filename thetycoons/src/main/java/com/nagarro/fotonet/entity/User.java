package com.nagarro.fotonet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * This entity stores user information.
 * @author NSPL
 *
 */
@Entity
@Table(name="user")
public class User extends AbstractEntity {
    
    @Version
    private Integer version;
    
    @Column(name="user_name")
    private String userName;
    
    @Column(name="subscription_id")
    private long subscriptionId;
    
	public User() {}
    
    public User(String userName) {
        this.userName = userName;
    }
    
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
    
}

enum Role {
    ADMIN,CANDIDATE;
}
