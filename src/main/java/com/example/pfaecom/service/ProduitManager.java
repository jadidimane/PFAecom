package com.example.pfaecom.service;

import com.example.pfaecom.dao.entities.Categorie;
import com.example.pfaecom.dao.entities.Produit;

import java.util.List;

public interface ProduitManager {
    Produit ajouterProduit(Produit produit);

    Produit modifierProduit(Produit produit);

    List<Produit> listProduits();

    void delete(Produit produit);

    List<Produit> findByKeyword(String keyword);

    List<Produit> findByCategorie(Categorie categorie);
}
