package com.example.gestion_publication.Services;

import com.example.gestion_publication.DTO.ArticleDto;
import com.example.gestion_publication.Entity.ArticleEntity;
import com.example.gestion_publication.Repository.ArticleRepo;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{
    private final ArticleRepo articleRepo;

    public ArticleServiceImpl(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @Override
    public ArticleEntity createArt(ArticleDto articleDto) {
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setArticleId(articleDto.getArticleId());
        articleEntity.setContenu(articleDto.getContenu());
        articleEntity.setDate(articleDto.getDate());
        articleEntity.setTitre(articleDto.getTitre());
        articleEntity.setSous_titre(articleDto.getSous_titre());
        articleRepo.save(articleEntity);
        return articleEntity;
    }
}
