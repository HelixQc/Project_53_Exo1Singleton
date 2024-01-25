package view;

import model.Planets;
import model.Soleil;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world, D'Artagnan is about to take over your PC!");

        Soleil s = Soleil.getInstance();
        Soleil ss = Soleil.getInstance();

        Planets p = Planets.getInstance();
        Planets pp = Planets.getInstance();

        //print in console the instance
        System.out.println(s);
        System.out.println(ss);

        System.out.println(p);
        System.out.println(pp);

        System.out.println("Sike!!!");
    }
}