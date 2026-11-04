package realestate;

public class Room {
    private String name;
    private boolean isRenovated;

    public Room(String name) {
        this.name = name;
        this.isRenovated = false;
    }

    public String getName() {
        return name;
    }

    public boolean isRenovated() {
        return isRenovated;
    }

    // Метод для ремонта
    public void makeRenovation() {
        this.isRenovated = true;
    }
}