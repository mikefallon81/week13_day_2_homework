package com.codeclan.documents.documentsservice.repository;

import com.codeclan.documents.documentsservice.models.File;
import com.codeclan.documents.documentsservice.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
