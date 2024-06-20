package com.example.pfaecom.web;

import com.example.pfaecom.dao.entities.Categorie;
import com.example.pfaecom.dao.entities.Produit;
import com.example.pfaecom.service.ProduitManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProduitController {
    @Autowired
    ProduitManager produitManager;
    @PostMapping("/addProduct")
    Produit ajoutProduit(@RequestBody Produit product){
        return  produitManager.ajouterProduit(product);
    }
    @PostMapping("/updateProduct")
    Produit modifierProduit(@RequestBody Produit product){
        return produitManager.modifierProduit(product);
    }
    @GetMapping("/listProducts")
    List<Produit> getAllProduct(){
        return produitManager.listProduits();
    }
    @GetMapping("findByCategorie")
    List<Produit> findProduitByCategorie(@RequestBody Categorie categorie){
        return produitManager.findByCategorie(categorie);
    }
}
