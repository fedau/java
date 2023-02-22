package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    long countByAgeGreaterThan(int age);
    List<Pirate> findByAgeGreaterThan(int age);

    List<Pirate> findByFirstName(String firstName);

    List<Pirate> findDistinctByFirstNameAndLastName(String firstName, String lastName);
}

