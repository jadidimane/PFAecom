package com.example.pfaecom.service;

import com.example.pfaecom.dao.entities.Categorie;

import java.util.List;

public interface CategorieManager {
    Categorie ajouterCategorie(Categorie categorie);

    Categorie modifierCategorie(Categorie categorie);

    void deleteCategorie(Categorie categorie);

    List<Categorie> findByKeyword(String keyword);

    List<Categorie> getAllCategories();
}
