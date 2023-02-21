package com.codeclan.example.pirateservice_d1_starter.controllers;

import com.codeclan.example.pirateservice_d1_starter.models.Pirate;
import com.codeclan.example.pirateservice_d1_starter.models.Raid;
import com.codeclan.example.pirateservice_d1_starter.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RaidController {

    @Autowired
    RaidRepository raidRepo;

    @PostMapping(value = "/raids")
    public ResponseEntity<Raid> createRaid(@RequestBody Raid raid) {
        raidRepo.save(raid);
        return new ResponseEntity<>(raid, HttpStatus.CREATED);
    }

    @GetMapping("/raids")
    public ResponseEntity<List<Raid>> getAllRaids(){
        return new ResponseEntity<>(raidRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/raids/{id}")
    public ResponseEntity getRaid(@PathVariable Long id){
        return new ResponseEntity<>(raidRepo.findById(id), HttpStatus.OK);
    }
}
