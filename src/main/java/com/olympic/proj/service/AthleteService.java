package com.olympic.proj.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympic.proj.model.Athlete;
import com.olympic.proj.repository.AthleteRepository;

//contains business logic, namely for the REST API

@Service
public class AthleteService {
    private final AthleteRepository athleteRepository; 

    @Autowired
    public AthleteService(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    public List<Athlete> getAthletes() {
        return athleteRepository.findAll();
    }
    
    public List<Athlete> getAthletesFromNationality(String nationality) {
        return athleteRepository.findAll().stream()
            .filter(athlete -> athlete.getNationality().equalsIgnoreCase(nationality))
            .collect(Collectors.toList());
    }

    public List<Athlete> getAthletesByName(String searchText) {
        return athleteRepository.findAll().stream()
            .filter(athlete -> athlete.getName().toLowerCase().contains(searchText.toLowerCase()))
            .collect(Collectors.toList());
    }

    public void saveAthlete(Athlete athlete) {
        athleteRepository.save(athlete);
    }

    public Optional<Athlete> getAthleteById(String id) {
        return athleteRepository.findById(id);
    }

    public Optional<Athlete> getAthleteByName(String name) {
        return athleteRepository.findByName(name);
    }
}