package kg.internet.service;

import kg.internet.entity.Client;

import java.util.List;

public interface ClientService {
    Client create(Client client);
    Client findById(Long id);
    List<Client> getAll();
}
