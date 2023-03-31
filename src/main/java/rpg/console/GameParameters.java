package rpg.console;

public class GameParameters {

    public int level =1;
    // Fonction pour récupérer la description d'un niveau
    public String getLevelDescription(int level) {
        this.level = level;
        String description = "";
        switch(level) {
            case 1:
                description = "Première année : The Philosopher’s Stone.";
                break;
            case 2:
                description = "Deuxième année : The Chamber of Secrets.";
                break;
            case 3:
                description = "Troisième année : The Prisonner of Azkaban.";
                break;
            case 4:
                description = "Quarième année : The Goblet of Fire.";
                break;
            case 5:
                description = "Cinquième année : The Order of the Phenix.";
                break;
            case 6:
                description = "Sixième année : The Half-Blood Prince.";
                break;
            case 7:
                description = "Septième année : The Deathly Hallows.";
                break;
            default:
                description = "Ce niveau n'existe pas. Nous avons un problème technique, veuillez nous excuser.";
        }
        return description;
    }

    // Fonction pour récupérer le nombre maximum de niveaux
    public int getMaxLevel() {
        int maxLevel;
        maxLevel=7;
        return maxLevel;
    }
}
