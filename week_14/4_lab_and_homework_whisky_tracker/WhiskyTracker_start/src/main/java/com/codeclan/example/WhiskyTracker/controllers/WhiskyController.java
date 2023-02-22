package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/whiskies")
    public ResponseEntity<List<Whisky>> getAllWhiskies(@RequestParam Optional<Integer> year, @RequestParam Optional<String> distilleryName,
                                                       @RequestParam Optional<Integer> age, @RequestParam Optional<String> region){
        if(year.isPresent()){
            return new ResponseEntity<>(whiskyRepository.findByYear(year.get()), HttpStatus.OK);
        } else if (distilleryName.isPresent() && age.isPresent()) {
            return new ResponseEntity<>(whiskyRepository.findByDistilleryNameAndAge(distilleryName.get(), age.get()), HttpStatus.OK);
        }
        else if (region.isPresent()) {
            return new ResponseEntity<>(whiskyRepository.findByDistilleryRegion(region.get()),HttpStatus.OK);

        }
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/whiskies/{id}")
    public ResponseEntity getwhiskies(@PathVariable Long id){
        return new ResponseEntity<>(whiskyRepository.findById(id), HttpStatus.OK);
    }
    @PostMapping(value = "/whiskies")
    public ResponseEntity<Whisky> createwhiskies(@RequestBody Whisky wisky){
        whiskyRepository.save(wisky);
        return new ResponseEntity<>(wisky, HttpStatus.CREATED);
    }
}
