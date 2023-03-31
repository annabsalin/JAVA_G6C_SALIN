package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.console.Display;
import rpg.console.InputParser;

@Setter
@Getter
public class Character {

    InputParser inputParser;
    Display display;
    //attribuation des variables


    int maxLifePoints;
    int lifePoints;

    int nbMaxPotion;
    int nbPotion;
    int damage;

    public String name;

    //function used in levels

    public boolean stillAlive() {
        return (this.lifePoints > 0);
    }
    public boolean dead(){return (this.lifePoints<=0);}

    public int getMaxLifePoints() {
        return maxLifePoints;
    }

    public void setMaxLifePoints(int maxLifePoints) {
        this.maxLifePoints = maxLifePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getNbMaxPotion() {
        return nbMaxPotion;
    }

    public void setNbMaxPotion(int nbMaxPotion) {
        this.nbMaxPotion = nbMaxPotion;
    }

    public int getNbPotion() {
        return nbPotion;
    }

    public void setNbPotion(int nbPotion) {
        this.nbPotion = nbPotion;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        lifePoints -= damage;
    }


    //Constructor, level permet d'augmenter le niveau des ennemis selon les différents niveaux
    public Character(String name, int damage, int maxLifePoints, int lifePoints) {
        this.damage = damage;//(int)(level * (float)damage);

        this.maxLifePoints=maxLifePoints;//(int)(level *(float)maxLifePoints);
        this.lifePoints=lifePoints;//(int)(level*(float)lifePoints);
    }

}
