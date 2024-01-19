package model;
import control.Comportement;
import data.PlanetsDAO;

import java.util.List;



public class Planets implements Comportement {

    private String name;
    private int circumference;
    private Soleil mySoleil = Soleil.getInstance();

    //need fixes on PlanetsDAO//
    private static Planets instance = null;

    private List<Satellite> satellites;

    //empty constructor
    private Planets() {

    }

    //constructor
    public Planets(String name, int circumference) {
        this.name = name;
        this.circumference = circumference;
    }

    //method getInstance
    public static Planets getInstance() {
        if(instance == null){
            instance = new Planets("p1", 2);
        }
        return instance;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public Soleil getMySoleil() {
        return mySoleil;
    }

    public void setMySoleil(Soleil mySoleil) {
        this.mySoleil = mySoleil;
    }

    @Override
    public String toString() {

        return String.format("Cette planet ce nomme, %s son soleil est %s et elle a une circonférence de %s",this.name, this.mySoleil, this.circumference);
    }
}
