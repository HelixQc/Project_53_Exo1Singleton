package model;

import control.Comportement;

import java.util.Date;

public class Satellite implements Comportement {

    private String Name;
    private Date lunchDate;
    private String description;

    //Satellite associate to one planet

    //Getters & Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getLunchDate() {
        return lunchDate;
    }

    public void setLunchDate(Date lunchDate) {
        this.lunchDate = lunchDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Empty constructor
    public Satellite() {
    }

    //Constructor
    public Satellite(String name, Date lunchDate, String description) {
        Name = name;
        this.lunchDate = lunchDate;
        this.description = description;
    }
}
