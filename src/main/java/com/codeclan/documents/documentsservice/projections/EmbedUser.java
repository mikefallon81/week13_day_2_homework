package com.codeclan.documents.documentsservice.projections;

import com.codeclan.documents.documentsservice.models.File;
import com.codeclan.documents.documentsservice.models.Folder;
import com.codeclan.documents.documentsservice.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
    List<File> getFiles();
}
