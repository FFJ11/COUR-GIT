package com.example.gestion_publication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TexteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long texteId;
    private  String titre ;
    private  String sous_titre;
    private String contenu;
}
