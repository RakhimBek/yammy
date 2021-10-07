package com.krosh.yammy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MessageStorage {
    public Map<String, Collection<Message>> getStringMessageMap() {
        return stringMessageMap;
    }

    private Map<String, Collection<Message>> stringMessageMap = new HashMap<>();

}
