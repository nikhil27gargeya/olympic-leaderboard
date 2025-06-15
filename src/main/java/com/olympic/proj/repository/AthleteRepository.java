package com.olympic.proj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olympic.proj.model.Athlete;

//Repository interface handles database operations for the "Athlete" entity using the Spring Data JPA 

@Repository
public interface AthleteRepository extends JpaRepository<Athlete, String> {
    void deleteByName(String athleteName);
    Optional<Athlete> findByName(String name);
    
}
