package model;
import control.Comportement;

import java.util.List;



public class Planets implements Comportement {

    private String name;
    private int circumference;

    private List<Planets> planetsList;

    //empty constructor
    private Planets() {

    }

    //constructor
    private Planets(String name, int circumference) {
        this.name = name;
        this.circumference = circumference;
    }
}
