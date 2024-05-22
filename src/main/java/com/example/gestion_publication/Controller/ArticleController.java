package com.example.gestion_publication.Controller;

import com.example.gestion_publication.DTO.ArticleDto;
import com.example.gestion_publication.Entity.ArticleEntity;
import com.example.gestion_publication.Repository.ArticleRepo;
import com.example.gestion_publication.Services.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("art")
public class ArticleController {
    private  final ArticleService articleService;
    private final ArticleRepo articleRepo;
    public ArticleController(ArticleService articleService, ArticleRepo articleRepo) {
        this.articleService = articleService;
        this.articleRepo = articleRepo;
    }

    @PostMapping("/create")
    public ResponseEntity<ArticleEntity> createArt(@RequestBody ArticleDto articleDto){
        return  new ResponseEntity<>(articleService.createArt(articleDto), HttpStatus.CREATED);
    }

    @PostMapping("delete/{id}")
    public void deleteArt(@PathVariable("id") long id){
        articleRepo.deleteById(id);
    }
}
