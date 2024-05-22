package com.example.gestion_publication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commentaireId ;
    private String contenu;
    private Date date;
}
