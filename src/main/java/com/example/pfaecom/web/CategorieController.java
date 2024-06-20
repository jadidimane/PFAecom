package com.example.pfaecom.web;

import com.example.pfaecom.dao.entities.Categorie;
import com.example.pfaecom.service.CategorieManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategorieController {
    @Autowired
    CategorieManager categorieManager;
    @PostMapping("/addCategorie")
    Categorie addCategorie(@RequestBody Categorie categorie){
        return categorieManager.ajouterCategorie(categorie);
    }
    @PostMapping("editCategorie")
    Categorie editCategorie(@RequestBody Categorie categorie){
        return categorieManager.modifierCategorie(categorie);
    }
    @GetMapping("listCategories")
    List<Categorie> categorieList(){
        return categorieManager.getAllCategories();
    }
}
