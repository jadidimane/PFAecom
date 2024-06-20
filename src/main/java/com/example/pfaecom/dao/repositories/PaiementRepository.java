package com.example.pfaecom.dao.repositories;

import com.example.pfaecom.dao.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement,Integer> {
}
