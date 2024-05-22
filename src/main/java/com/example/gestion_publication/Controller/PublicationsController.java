package com.example.gestion_publication.Controller;

import com.example.gestion_publication.DTO.PublicatioDto;
import com.example.gestion_publication.Entity.PublicationEntity;
import com.example.gestion_publication.Services.PublicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pub")
public class PublicationsController {
    private final PublicationService publicationService;

    public PublicationsController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }
    @PostMapping("/create")
    public ResponseEntity<PublicationEntity> createPub(@RequestBody PublicatioDto publicatioDto,Long id){
        return new ResponseEntity<>(publicationService.createPub(publicatioDto,id), HttpStatus.CREATED);
    }
}
