package com.files_foldersexample.files_and_folders.controllers;

import com.files_foldersexample.files_and_folders.models.Files;
import com.files_foldersexample.files_and_folders.models.Person;
import com.files_foldersexample.files_and_folders.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FilesController {
    @Autowired
    FileRepository fileRepo;

    @PostMapping(value = "/files")
    public ResponseEntity<Files> createPerson(@RequestBody Files file){
        fileRepo.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
    @GetMapping(value = "/files")
    public List<Files> getAllFiles(){
        return  fileRepo.findAll();
    }

    @GetMapping(value = "/files/{id}")
    public Optional<Files> getFile(@PathVariable Long id){
        return fileRepo.findById(id);
    }
}
