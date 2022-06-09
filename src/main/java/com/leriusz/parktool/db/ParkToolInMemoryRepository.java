package com.leriusz.parktool.db;

import com.leriusz.parktool.dto.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkToolInMemoryRepository implements ParkToolRepository {

    private Map<Integer, Client> database = new HashMap<>();

    @Override
    public void save(Client client) {
        database.put(client.getId(), client);
    }

    @Override
    public Optional<Client> get(int clientId) {
        return Optional.ofNullable(database.get(clientId));
    }
}
