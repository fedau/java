package com.codeclan.example.pirateservice_d1_starter.controllers;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

    @PostMapping(value = "/pirates")
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate){
        pirateRepository.save(pirate);
        return new ResponseEntity<>(pirate, HttpStatus.CREATED);
    }

    @PutMapping(value = "/pirates/{id}")
    public ResponseEntity<Pirate> updatePirate(@PathVariable Long id, @RequestBody Pirate pirate){
        Pirate updatePirate = pirateRepository.findById(id).get();
        updatePirate.setFirstName(pirate.getFirstName());
        updatePirate.setLastName(pirate.getLastName());
        updatePirate.setAge(pirate.getAge());

        pirateRepository.save(updatePirate);

        return new ResponseEntity<>(updatePirate, HttpStatus.CREATED);

    }

    @GetMapping(value = "/pirates")
    public List<Pirate> getAllPirates(){
      return  pirateRepository.findAll();
    }

    @GetMapping(value = "/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }
}
