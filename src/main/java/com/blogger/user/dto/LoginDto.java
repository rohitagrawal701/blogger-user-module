package com.blogger.user.dto;

import java.io.Serializable;

public class LoginDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String bloggerName;

    private String password;

    public LoginDto() {
        super();
    }

    public LoginDto(final String bloggerName, final String password) {
        super();
        this.bloggerName = bloggerName;
        this.password = password;
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

}
