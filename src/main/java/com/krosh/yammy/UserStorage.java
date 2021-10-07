package com.krosh.yammy;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class UserStorage {
    {
        getUserInfos().add(new UserInfo("Илья С", "Now"));
        getUserInfos().add(new UserInfo("Раимбек Р", "04.10.2021"));
        getUserInfos().add(new UserInfo("Игорь М", "10 min ago"));
    }
    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    private static List<UserInfo> userInfos = new LinkedList<>();
}
