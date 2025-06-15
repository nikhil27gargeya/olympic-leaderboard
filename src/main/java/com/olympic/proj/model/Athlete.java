package com.olympic.proj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity class represents our data model, entity annotation specifies that this class should be mapped to a database table
//Table annotation specifies the name of the database table that will store instances of this entity

@Entity
@Table(name="athletes")
public class Athlete {

    @Id
    private String id;
    private String gender;
    private String event;
    private String location;
    private String year;
    private String medal;
    private String name;
    private String nationality;
    private String result;

    public Athlete() {
        
    }

    public Athlete(String id, String gender, String event, String location, String year, String medal, String name,
            String nationality, String result) {
        this.id = id;
        this.gender = gender;
        this.event = event;
        this.location = location;
        this.year = year;
        this.medal = medal;
        this.name = name;
        this.nationality = nationality;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
