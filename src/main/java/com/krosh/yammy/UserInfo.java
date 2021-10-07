package com.krosh.yammy;

public class UserInfo {
    public UserInfo(String username, String lastLoginDate) {
        this.username = username;
        this.lastLoginDate = lastLoginDate;
    }

    private String username;
    private String lastLoginDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
