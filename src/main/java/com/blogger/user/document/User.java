package com.blogger.user.document;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User extends BaseDocument {

    String bloggerName;

    String firstName;

    String middleName;

    String lastName;

    Date dateOfBirth;
    
    Date lastLogin;
    
    Date createdOn;

    private String password;

    Address address;

    public User() {
        super();
    }

    public User(String bloggerName, String firstName, String middleName,
            String lastName, Date dateOfBirth, Date lastLogin, Date createdOn,
            String password, Address address) {
        super();
        this.bloggerName = bloggerName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.lastLogin = lastLogin;
        this.createdOn = createdOn;
        this.password = password;
        this.address = address;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
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

}
