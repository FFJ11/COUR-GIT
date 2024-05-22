package com.example.gestion_publication.DTO;

import lombok.Data;

import java.util.Date;
@Data
public class ArticleDto {
    private long articleId;
    private String titre;
    private String sous_titre;
    private String contenu;
    private String description;
    private Date date;

}
