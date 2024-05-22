package com.example.gestion_publication.DTO;

import com.example.gestion_publication.Entity.ArticleEntity;
import com.example.gestion_publication.Entity.CommentaireEntity;
import com.example.gestion_publication.Entity.TexteEntity;
import com.example.gestion_publication.Entity.TypePublication;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Data
public class PublicatioDto {
    private long publicId;
    private String description;
    @OneToOne
    private long typePublication;
    @OneToMany
    private List<CommentaireEntity> commentaires;
    private String contenu;
    @ManyToOne
    private long article;
    @OneToMany
    private long texte;
    private String etat;
    private Date date;
}
