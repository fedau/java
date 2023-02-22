package com.files_foldersexample.files_and_folders.components;

import com.files_foldersexample.files_and_folders.models.Files;
import com.files_foldersexample.files_and_folders.models.Folders;
import com.files_foldersexample.files_and_folders.models.Person;
import com.files_foldersexample.files_and_folders.repositories.FileRepository;
import com.files_foldersexample.files_and_folders.repositories.FolderRepository;
import com.files_foldersexample.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepo;

    @Autowired
    private FolderRepository folderRepo;

    @Autowired
    private PersonRepository personRepo;


    public void run(ApplicationArguments args) throws Exception {

        Person lou = new Person("Lou");
        personRepo.save(lou);

        Person reed= new Person("Reed");
        personRepo.save(reed);

        Folders human = new Folders("human", reed);
        folderRepo.save(human);

        Folders car = new Folders("car", lou);
        folderRepo.save(car);

        Files arm = new Files("Left-Arm", "pdf", 3, human);
        fileRepo.save(arm);

        Files window = new Files("Window", "pdf", 2, car);
        fileRepo.save(window);


    }
}
