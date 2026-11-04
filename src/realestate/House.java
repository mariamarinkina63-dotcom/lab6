package realestate;

public class House extends Building {
    public House(String address, double area, double price, int roomCount) {
        super(address, area, price, roomCount); // конструктор родителя
    }

    // метод для дома
    public void buildGarage() {
        System.out.println("к дому пристроен гараж");
    }

    @Override
    public void printInfo() {
        System.out.println("ДОМ. Адрес: " + address + " | Площадь: " + area + " кв.м | Комнат: " + getRoomCount());
    }
}