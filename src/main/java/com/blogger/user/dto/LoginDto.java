package com.blogger.user.dto;

import java.io.Serializable;

public class LoginDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String bloggerName;

    private String password;

    private String newPassword;

    public LoginDto() {
        super();
    }

    public LoginDto(final String bloggerName, final String password,
            final String newPassword) {
        super();
        this.bloggerName = bloggerName;
        this.password = password;
        this.newPassword = newPassword;
    }

    public String getBloggerName() {
        return bloggerName;
    }

    public void setBloggerName(final String bloggerName) {
        this.bloggerName = bloggerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(final String newPassword) {
        this.newPassword = newPassword;
    }

}
