package com.dashproject.demo;

import java.util.List;

public interface AthleteService {
    List<Athlete> findAll();
    void createAthlete();
}