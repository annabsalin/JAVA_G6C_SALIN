package rpg;

import rpg.console.InputParser;

import java.util.Scanner;

import static java.lang.System.out;

public enum Wand {
    UNICORN,
    DRAGON,
    PHENIX;

    public String core;
    public int size;

    /*Core(String core) { this.core=core;}
    Size(int size) { this.size=size;}*/

    public static Wand getCore(int core){
        return Wand.values()[core - 1];
    }

    public static Wand getSize(int size){
        return Wand.values()[size - 1];
    }
}
