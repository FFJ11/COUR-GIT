package com.example.gestion_publication.Repository;

import com.example.gestion_publication.Entity.TypePublication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypepubliRepo extends JpaRepository<TypePublication,Long> {
}
