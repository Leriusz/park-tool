package com.leriusz.parktool;


import com.leriusz.parktool.db.ParkToolRepository;
import com.leriusz.parktool.db.ParkToolInMemoryRepository;
import com.leriusz.parktool.dto.Client;

public class ParkToolApp {

    public static void main(String[] args) {

        ParkToolRepository repository = new ParkToolInMemoryRepository();

        int clientId = 1;

        Client client = new Client(clientId, "julcio", 24);

        repository.save(client);

        System.out.println(repository.get(clientId));
    }
}
