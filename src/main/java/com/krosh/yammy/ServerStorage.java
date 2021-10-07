package com.krosh.yammy;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ServerStorage {
    {
        getServerDataList().add(new ServerData("1234","www.ru"));
        getServerDataList().add(new ServerData("8888","sberbunk.ru"));
    }
    public List<ServerData> getServerDataList() {
        return serverDataList;
    }

    private List<ServerData> serverDataList = new LinkedList<>();
}
