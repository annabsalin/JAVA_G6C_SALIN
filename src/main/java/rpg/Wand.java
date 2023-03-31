package rpg;

import rpg.console.InputParser;

import java.util.Scanner;

import static java.lang.System.out;

public class Wand {

    public Core core;
    public int size;

    /*Core(String core) { this.core=core;}
    Size(int size) { this.size=size;}*/

    public Wand(Core core, int size) {
        this.core = core;
        this.size = size;
    }
}
