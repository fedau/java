package com.files_foldersexample.files_and_folders.controllers;

import com.files_foldersexample.files_and_folders.models.Person;
import com.files_foldersexample.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepo;

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personRepo.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
    @GetMapping(value = "/persons")
    public List<Person> getAllPerons(){
        return  personRepo.findAll();
    }

    @GetMapping(value = "/persons/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return personRepo.findById(id);
    }
}
