package com.example.pfaecom.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String designation;
    private Integer quantity;
    private Integer orderedQuantity;
    private Double prixUnitaire;
    @ManyToOne
    private Categorie categorie;
    @ManyToMany
    private List<Produit> paniers=new ArrayList<Produit>();

}
