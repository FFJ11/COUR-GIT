package com.example.gestion_publication.Repository;

import com.example.gestion_publication.Entity.TexteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TexteRepo extends JpaRepository<TexteEntity,Long> {
    @Query(value = "SELECT * FROM TexteEntity WHERE PublicationEntity =: id",nativeQuery = true)
    TexteEntity findAllByPublicationId(Long texteId);
}
