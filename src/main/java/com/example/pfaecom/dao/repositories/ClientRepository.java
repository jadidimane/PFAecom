package com.example.pfaecom.dao.repositories;

import com.example.pfaecom.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer > {
    public Client findByUsername(String username);
}
