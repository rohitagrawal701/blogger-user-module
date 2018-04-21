package com.blogger.user.dto;

import java.io.Serializable;

public class AddressDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8079220141932948549L;

    String addressLine;

    String city;

    String state;

    String emailId;

    public AddressDto() {
    }

    public AddressDto(final String addressLine, final String city,
            final String state, final String emailId) {
        super();
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(final String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }
}
