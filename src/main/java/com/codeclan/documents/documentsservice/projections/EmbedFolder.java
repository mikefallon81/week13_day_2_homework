package com.codeclan.documents.documentsservice.projections;

import com.codeclan.documents.documentsservice.models.File;
import com.codeclan.documents.documentsservice.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getTitle();
    String getExtension();
    int getSize();
    Folder getFolder();
}
