package com.example.gestion_publication.Repository;

import com.example.gestion_publication.Entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<ArticleEntity,Long> {
}
