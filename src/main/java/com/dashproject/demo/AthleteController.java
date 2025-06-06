package com.dashproject.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class AthleteController {
    private List<Athlete> athletes = new ArrayList<>();

    @GetMapping("/athletes")
    public List<Athlete> findAll() {
        return athletes;
    }

    @PostMapping("/athletes")
    public String createAthlete(@RequestBody Athlete athlete) {
        athletes.add(athlete);
        return "Athlete added";
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
