package model;

import java.util.List;

public class Soleil {

    private static Soleil instance = null;

    private int age;
    private String galaxy;
    private List<Planets> planetsList;


    //methods to get the instance
    public static Soleil getInstance() {
        if(instance == null){
            instance = new Soleil(1,"Singe De Malibu");
        }
        return instance;
    }

    //empty constructor
    public Soleil(){}

    //Constructor


    public Soleil(int age, String galaxy) {
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

    @Override
    public String toString() {
        return String.format("L'age de soleil est : %s , et il fait parti de la galaxie %s",this.age,this.galaxy);
    }
}
