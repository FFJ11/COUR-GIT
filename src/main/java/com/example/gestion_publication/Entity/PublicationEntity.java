package com.example.gestion_publication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long publicId;
    private String description;
    @OneToOne
    private TypePublication typePublication;
    @OneToMany
    private List<CommentaireEntity> commentaires;
    private String contenu;
    @ManyToOne
    private ArticleEntity article;
    @OneToMany
    private List<TexteEntity> texte;
    private String etat;
    private Date date;
}
