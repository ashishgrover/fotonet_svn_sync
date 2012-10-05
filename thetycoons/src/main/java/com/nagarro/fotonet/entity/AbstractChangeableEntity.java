/**
 * 
 */
package com.nagarro.fotonet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author shalini1814
 * 
 */
@MappedSuperclass
public class AbstractChangeableEntity extends AbstractEntity {

    @Column(name = "created_on")
    protected Date createdOn;

    @Column(name = "modified_on")
    protected Date modifiedOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

}
