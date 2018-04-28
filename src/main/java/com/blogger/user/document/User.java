package com.blogger.user.document;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User extends BaseDocument {

    @Indexed(unique = true)
    private String bloggerName;

    private String firstName;

    private String middleName;

    private String lastName;

    private Date dateOfBirth;

    private Date lastLogin;

    private Date createdOn;

    private Date updatedOn;

    private String password;

    private Address address;

    public User() {
        super();
    }

    public User(final String bloggerName, final String firstName,
            final String middleName, final String lastName,
            final Date dateOfBirth, final Date updatedOn, final Date lastLogin,
            final Date createdOn, final String password,
            final Address address) {
        super();
        this.bloggerName = bloggerName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.lastLogin = lastLogin;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
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

    public void setLastLogin(final Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(final Date updatedOn) {
        this.updatedOn = updatedOn;
    }

}
