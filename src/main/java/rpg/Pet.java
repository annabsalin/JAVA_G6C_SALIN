package rpg;

public enum Pet {
    CAT("chat"),
    RAT("rat"),
    OWL("chouette"),
    TOAD("crapaud");

    String name;

    Pet(String name) {
        this.name = name;
    }
}
