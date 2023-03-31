package rpg;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;


public enum House {

    SLYTHERIN("Serpentard"),
    GRYFFINDOR("Gryffondor"),
    RAVENCLAW("Serdaigle"),
    HUFFLEPUFF("Poufsouffle");

    public String house;

    House(String house) { this.house=house;}

    public static House getHouse(int house){
        return House.values()[house - 1];
    }
}
