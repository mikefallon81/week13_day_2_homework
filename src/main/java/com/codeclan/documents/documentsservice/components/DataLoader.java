package com.codeclan.documents.documentsservice.components;

import com.codeclan.documents.documentsservice.models.File;
import com.codeclan.documents.documentsservice.models.Folder;
import com.codeclan.documents.documentsservice.models.User;
import com.codeclan.documents.documentsservice.repository.FileRepository;
import com.codeclan.documents.documentsservice.repository.FolderRepository;
import com.codeclan.documents.documentsservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component


public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run (ApplicationArguments args){

        User user1 = new User("Michael");
        userRepository.save(user1);

        Folder folder1 = new Folder("personal", user1);
        folderRepository.save(folder1);

        File file1 = new File("cv", "pdf", 47, folder1);
        fileRepository.save(file1);




    }
}
