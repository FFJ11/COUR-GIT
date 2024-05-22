package com.example.gestion_publication.Services;

import com.example.gestion_publication.DTO.ArticleDto;
import com.example.gestion_publication.Entity.ArticleEntity;

public interface ArticleService {
    ArticleEntity createArt(ArticleDto articleDto);
}
