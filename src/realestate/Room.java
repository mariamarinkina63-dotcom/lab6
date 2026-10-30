package realestate;

public class Room {
    private String name; // Название комнаты (Кухня, Спальня и т.д.)
    private boolean isRenovated; // Сделан ли ремонт

    public Room(String name) {
        this.name = name;
        this.isRenovated = false; // По умолчанию ремонта нет
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