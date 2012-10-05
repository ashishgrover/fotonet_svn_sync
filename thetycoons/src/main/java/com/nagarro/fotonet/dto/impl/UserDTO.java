/**
 * 
 */
package com.nagarro.fotonet.dto.impl;

import com.nagarro.fotonet.dto.ItemDTO;

/**
 * @author shalini1814
 *
 */
public class UserDTO implements ItemDTO {

    private String userName;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
