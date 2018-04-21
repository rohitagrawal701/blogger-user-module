package com.blogger.user.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2737481750300539266L;

    private String id;

    String bloggerName;

    String firstName;

    String middleName;

    String lastName;

    Date dateOfBirth;

    private String password;

    AddressDto addressDto;

    public UserDto() {
    }

    public UserDto(final String bloggerName, final String firstName,
            final String middleName, final String lastName,
            final Date dateOfBirth, final AddressDto AddressDto,
            final String password) {
        super();
        this.bloggerName = bloggerName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressDto = AddressDto;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final Date dateOfBirth) {
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

}
