package com.krosh.yammy;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class RegisterRs {
    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    private List<UserInfo> userInfos = new LinkedList<>();
}
