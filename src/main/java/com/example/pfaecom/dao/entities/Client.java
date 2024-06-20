package com.example.pfaecom.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.pfaecom.dao.entities.Role;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private Integer age;
    @Column(name = "mail")
    private String mail;
    @Column(name = "telephone")
    private Integer telephone;
    @Column(name = "nomComplet")
    private String nomComplet;
    @Column(name = "adresse")
    private String adresse;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne
    private Panier panier;
}
