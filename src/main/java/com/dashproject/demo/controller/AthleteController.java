package com.dashproject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dashproject.demo.model.Athlete;
import com.dashproject.demo.service.AthleteService;

import org.springframework.web.bind.annotation.RequestParam;

//controller class that handles HTTP requests for the REST API

@RestController
public class AthleteController {
    private final AthleteService athleteService;

    //required dependencies will be injected at runtime
    @Autowired
    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }

    @GetMapping("/athletes")
    public List<Athlete> findAll() {
        return athleteService.getAthletes();
    }

    @GetMapping("/athletes/{id}")
    public ResponseEntity<Athlete> getAthleteById(@PathVariable String id) {
        return athleteService.getAthleteById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/athletes")
    public String createAthlete(@RequestBody Athlete athlete) {
        athleteService.saveAthlete(athlete);
        return "Athlete added";
    }

    @GetMapping("/athletes/nationality")
    public List<Athlete> getByNationality(@RequestParam String nationality) {
        return athleteService.getAthletesFromNationality(nationality);
    }

}

/*

GET /athletes: get all athletes
GET /athletes/{id}: get a specific athlete by ID
POST /athletes: create a new athlete
DELETE /athletes/{id}
PUT /athletes/{id}
GET /athletes/{id}/nationality

*/
