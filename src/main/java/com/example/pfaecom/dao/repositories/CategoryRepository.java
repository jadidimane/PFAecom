package com.example.pfaecom.dao.repositories;

import com.example.pfaecom.dao.entities.Categorie;
import com.example.pfaecom.dao.entities.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Categorie,Integer>{
    List<Categorie> findByTitleContains(String title);
}
