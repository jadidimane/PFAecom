package com.example.pfaecom.service;

import com.example.pfaecom.dao.entities.Paiement;

import java.util.List;

public interface PaiementManager {
    public Paiement addPaiement(Paiement paiement);
    public Paiement updatePaiement(Paiement paiement);
    public Boolean deletePaiement(Paiement paiement);
    public List<Paiement> getAllPaiements();
    public Paiement getPaiementById(Integer id);
}
