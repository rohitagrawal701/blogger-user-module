package com.blogger.user.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String bloggerName;

    private String firstName;

    private String middleName;

    private String lastName;

    private String dateOfBirth;

    private Date lastLogin;

    private Date createdOn;

    private Date updatedOn;

    private String password;

    private AddressDto addressDto;

    public UserDto() {
    }

    public UserDto(String id, String bloggerName, String firstName,
            String middleName, String lastName, String dateOfBirth,
            Date lastLogin, Date createdOn, Date updatedOn, String password,
            AddressDto addressDto) {
        super();
        this.id = id;
        this.bloggerName = bloggerName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.lastLogin = lastLogin;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.password = password;
        this.addressDto = addressDto;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getBloggerName() {
        return bloggerName;
    }

    public void setBloggerName(final String bloggerName) {
        this.bloggerName = bloggerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(final AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
