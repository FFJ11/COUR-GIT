package com.example.gestion_publication.Repository;

import com.example.gestion_publication.Entity.MediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepo extends JpaRepository<MediaEntity,Long> {
}
