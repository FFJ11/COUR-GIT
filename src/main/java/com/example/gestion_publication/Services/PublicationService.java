package com.example.gestion_publication.Services;

import com.example.gestion_publication.DTO.PublicatioDto;
import com.example.gestion_publication.Entity.PublicationEntity;

public interface PublicationService {
    PublicationEntity createPub(PublicatioDto publicatioDto,Long id);
}
