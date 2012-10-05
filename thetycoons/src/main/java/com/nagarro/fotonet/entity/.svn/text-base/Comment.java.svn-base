/**
 * 
 */
package com.nagarro.fotonet.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author shalini1814
 *
 */
@Entity
@Table(name="comment")
public class Comment extends AbstractEntity {

    @Version
    private Integer version;
    
    private String comment;

    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
