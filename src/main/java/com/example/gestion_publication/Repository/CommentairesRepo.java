package com.example.gestion_publication.Repository;

import com.example.gestion_publication.Entity.CommentaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentairesRepo extends JpaRepository<CommentaireEntity,Long> {
}
