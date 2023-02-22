package com.files_foldersexample.files_and_folders.controllers;

import com.files_foldersexample.files_and_folders.models.Folders;
import com.files_foldersexample.files_and_folders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderControllers {
    
    @Autowired
    FolderRepository folderRepo;
    @PostMapping(value = "/folders")
    public ResponseEntity<Folders> createfolder(@RequestBody Folders folder){
        folderRepo.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
    @GetMapping(value = "/folders")
    public List<Folders> getAllFolders(){
        return  folderRepo.findAll();
    }

    @GetMapping(value = "/folders/{id}")
    public Optional<Folders> getfolder(@PathVariable Long id){
        return folderRepo.findById(id);
    }
}
