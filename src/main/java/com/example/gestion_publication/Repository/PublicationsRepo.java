package com.example.gestion_publication.Repository;

import com.example.gestion_publication.Entity.PublicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationsRepo extends JpaRepository<PublicationEntity,Long> {
}
