package com.example.pfaecom.service;

import com.example.pfaecom.dao.entities.Client;

import java.util.List;

public interface ClientManager {
    public Client addClient(Client client);
    public Client updateClient(Client client);
    public Boolean deleteClient(Client client);
    public List<Client> getAllClients();
    public Client getClientById(Integer id);
    public Client getClientByUsername(String username);
}
