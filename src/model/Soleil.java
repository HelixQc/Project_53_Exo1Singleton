package model;

import java.util.List;

public class Soleil {

    private static Soleil instance = null;

    private String name;
    private int age;
    private String galaxy;
    private List<Planets> planetsList;


    //methods to get the instance
    public static Soleil getInstance() {
        if(instance == null){
            instance = new Soleil("D'Artagnan",1,"Singe De Malibu");
        }
        return instance;
    }

    //empty constructor
    public Soleil(){}

    //Constructor


    public Soleil(String name, int age, String galaxy) {
        this.name = name;
        this.age = age;
        this.galaxy = galaxy;
    }

    //Getters & Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public String getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(String galaxy) {
        this.galaxy = galaxy;
    }

    public List<Planets> getPlanetsList() {
        return planetsList;
    }

    public void setPlanetsList(List<Planets> planetsList) {
        this.planetsList = planetsList;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("L'age du soleil %s est  %s  et il fait parti de la galaxie %s",this.name,this.age,this.galaxy);
    }
}
