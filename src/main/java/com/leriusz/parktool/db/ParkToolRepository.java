package com.leriusz.parktool.db;

import com.leriusz.parktool.dto.Client;

import java.util.Optional;

public interface ParkToolRepository {

    void save(Client client);

    Optional<Client> get(int clientId);
}
