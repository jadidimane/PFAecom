package com.example.pfaecom.service;

import com.example.pfaecom.SoldOutException;
import com.example.pfaecom.dao.entities.Client;
import com.example.pfaecom.dao.entities.Produit;

public interface PanierManager {
    void ajouterAuPanier(Produit produit, Client client) throws SoldOutException;

    void supprimerDuPanier(Produit produit,Client client);
}
