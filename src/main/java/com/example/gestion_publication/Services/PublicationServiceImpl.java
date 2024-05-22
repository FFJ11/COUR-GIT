package com.example.gestion_publication.Services;

import com.example.gestion_publication.DTO.PublicatioDto;
import com.example.gestion_publication.Entity.ArticleEntity;
import com.example.gestion_publication.Entity.PublicationEntity;
import com.example.gestion_publication.Entity.TexteEntity;
import com.example.gestion_publication.Entity.TypePublication;
import com.example.gestion_publication.Repository.ArticleRepo;
import com.example.gestion_publication.Repository.PublicationsRepo;
import com.example.gestion_publication.Repository.TexteRepo;
import com.example.gestion_publication.Repository.TypepubliRepo;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PublicationServiceImpl implements PublicationService {
    private final ArticleRepo articleRepo;
    private final TypepubliRepo typepubliRepo;
    private final TexteRepo texteRepo;
    private final PublicationsRepo publicationsRepo;

    public PublicationServiceImpl(ArticleRepo articleRepo, TypepubliRepo typepubliRepo, TexteRepo texteRepo, PublicationsRepo publicationsRepo) {
        this.articleRepo = articleRepo;
        this.typepubliRepo = typepubliRepo;
        this.texteRepo = texteRepo;
        this.publicationsRepo = publicationsRepo;
    }

    @Override
    public PublicationEntity createPub(PublicatioDto publicatioDto,Long articleId) {
        PublicationEntity publicationEntity = new PublicationEntity();
        publicationEntity.setPublicId(publicatioDto.getPublicId());
        ArticleEntity articleEntity= articleRepo.findById(publicatioDto.getArticle()).orElseThrow(EntityNotFoundException::new);
        publicationEntity.setArticle(articleEntity);
        TypePublication typePublication= typepubliRepo.findById(publicatioDto.getTypePublication()).orElseThrow(EntityNotFoundException::new);
        publicationEntity.setTypePublication(typePublication);
        publicationEntity.setEtat(publicatioDto.getEtat());
        List<TexteEntity >  texteEntity = (List<TexteEntity>) texteRepo.findAllByPublicationId(publicatioDto.getTexte());
        publicationEntity.setTexte(texteEntity);
        publicationsRepo.save(publicationEntity);
        return null;
    }
}
