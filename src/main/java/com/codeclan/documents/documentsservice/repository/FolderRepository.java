package com.codeclan.documents.documentsservice.repository;

import com.codeclan.documents.documentsservice.models.Folder;

import com.codeclan.documents.documentsservice.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
