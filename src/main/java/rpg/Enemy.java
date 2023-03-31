package rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemy extends Character {

    private String name;
    private int maxHp;
    private int currentHp;
    private int attack;


    public static String[] enemy = {"Troll","Basilic", "Détraqueurs", "Peter Pettigrow", "Voldemort","Mangemorts"};
    public Enemy(String name, int damage, int maxLifePoints, int lifePoints) {

        super(name, damage, maxLifePoints, lifePoints);
        this.name = name;
        this.damage = damage;
        this.maxLifePoints = maxLifePoints;
        this.lifePoints = lifePoints;
    }
    public static Enemy troll = new Enemy("Troll", 15, 60, 60);
    static Enemy basilic = new Enemy("Basilic", 50, 100,100);
    static Enemy detraqueurs = new Enemy("Détraqueurs", 20,120, 120);
    static Enemy peterPettigrow = new Enemy("Peter Pettigrow", 80,200, 200);
    static Enemy Voldemort = new Enemy("Voldemort", 120, 300,300);
    static Enemy doloresOmbrage = new Enemy("Dolores Ombrage", 100,250, 250);
    static Enemy deathEaters = new Enemy("Mangemort", 30,150, 150);
    static Enemy Bellatrix = new Enemy("Bellatrix Lestrange",100,250,250);


    /*public static void enemies() {
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy("Troll", 20, 100, 100));
        enemies.add(new Enemy("Basilic", 20, 100, 120));
        enemies.add(new Enemy("Détraqueurs", 25, 120, 150));
        enemies.add(new Enemy("Voldemort", 75, 300, 300));
        enemies.add(new Enemy("Peter Pettigrow", 15, 80, 80));
        enemies.add(new Enemy("Dolores Ombrage", 20, 100, 120));
        enemies.add(new Enemy("Mangemorts", 25, 120, 150));
        enemies.add(new Enemy())
    }*/

    public int getDamage() {
        return damage;
    }
}