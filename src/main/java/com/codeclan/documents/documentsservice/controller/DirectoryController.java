package com.codeclan.documents.documentsservice.controller;

import com.codeclan.documents.documentsservice.models.Folder;
import com.codeclan.documents.documentsservice.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/folders")

public class DirectoryController {
    @Autowired
    FolderRepository folderRepository;

    @GetMapping
    public List<Folder> getAllFolders(){
        return folderRepository.findAll();
    }



}
