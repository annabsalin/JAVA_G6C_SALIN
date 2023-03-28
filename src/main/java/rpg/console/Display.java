package rpg.console;

import rpg.Enemy;
import rpg.Wizard;

public class Display {
    public void printText(String text) {
        System.out.println(text);
    }

    public void printInt(int number){
        System.out.println(number);
    }
    public void printTextWithColor(String text, Color color){
        System.out.println(color.color + text + Color.BACK.color);
    }
    public String textWithColor(String text, Color color){
        StringBuilder sb = new StringBuilder();
        sb.append(color.color).append(text).append(Color.BACK.color);
        return sb.toString();
    }
    public String wrapText(String text, String wrapper) {
        StringBuilder sb = new StringBuilder();
        sb.append(wrapper).append("\n");
        sb.append(text).append("\n");
        sb.append(wrapper).append("\n");
        return sb.toString();
    }
    public void printTextWithWrapper(String text, String wrapper){
        printText(wrapper);
        printText(text);
        printText(wrapper);
    }

    public void displayLifePoints(Wizard wizard, Enemy enemy) {
        printText("Points de vie du sorcier: " + wizard.getLifePoints());
        printText("Points de vie de l'Ennemi: " + enemy.getLifePoints());
    }
}