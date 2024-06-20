package com.example.pfaecom.service;

import com.example.pfaecom.SoldOutException;
import com.example.pfaecom.dao.entities.Client;
import com.example.pfaecom.dao.entities.Panier;
import com.example.pfaecom.dao.entities.Produit;
import com.example.pfaecom.dao.repositories.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierService implements PanierManager {
    @Autowired
    PanierRepository panierRepository;
    @Override
    public void ajouterAuPanier(Produit produit, Client client) throws SoldOutException {
        Panier panier=client.getPanier();
        if(produit.getQuantity()>produit.getOrderedQuantity()){
            if(produit.getOrderedQuantity()==0){
                panier.getProduits().add(produit);
                panier.setProduits(panier.getProduits());
                produit.setOrderedQuantity(1);
                produit.setQuantity((produit.getQuantity()-1));}
            else{
                produit.setOrderedQuantity(produit.getOrderedQuantity()+1);
            }
        }
        else{
            throw new SoldOutException("Vous pouvez commander "+produit.getQuantity());
        }
    }
    @Override
    public void supprimerDuPanier(Produit produit, Client client){
        Panier panier=client.getPanier();
        if(produit.getOrderedQuantity()==0){
            panier.getProduits().remove(produit);
        }
        else{
            produit.setOrderedQuantity((produit.getOrderedQuantity()-1));
            produit.setQuantity(produit.getQuantity()+1);
        }
    }
    }
