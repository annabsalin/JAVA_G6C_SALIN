package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.console.Display;
import rpg.Wizard;
import rpg.Enemy;
import rpg.console.Main;

@Getter
@Setter

public class Level1 {
    Display displayLifePoints;
    Display display;
    Enemy troll = new Enemy("troll", 15,80, 80);
    Wizard wizard;

    public Level1(Wizard wizard){
        this.wizard=wizard;
        this.display = new Display();
        this.display.displayLifePoints(this.wizard, troll);
    }
}
