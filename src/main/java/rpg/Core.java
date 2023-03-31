package rpg;

public enum Core {
    UNICORN("crin de licorne"),
    DRAGON("coeur de dragon"),
    PHOENIX("plume de Phénix");

    String description;

    Core(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
