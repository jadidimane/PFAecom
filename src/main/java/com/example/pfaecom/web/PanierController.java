package com.example.pfaecom.web;

import com.example.pfaecom.SoldOutException;
import com.example.pfaecom.dao.entities.Client;
import com.example.pfaecom.dao.entities.Produit;
import com.example.pfaecom.service.PanierManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class PanierController {
    @Autowired
    PanierManager panierManager;
    @PostMapping("/addtoCart")
    void ajouterAuPanier(@RequestBody Produit produit,@RequestBody Client client){
        try{
        panierManager.ajouterAuPanier(produit,client);}catch (SoldOutException e){
            System.out.println(e.getMessage());
        }
    }
    @PostMapping("removefromCart")
    void supprimerduPanier(@RequestBody Produit produit,@RequestBody Client client){
        panierManager.supprimerDuPanier(produit,client);
    }
}
