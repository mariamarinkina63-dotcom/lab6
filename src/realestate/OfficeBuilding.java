package realestate;

public class OfficeBuilding extends Building {
    public OfficeBuilding(String address, double area, double price, int roomCount) {
        super(address, area, price, roomCount);
    }

    public void installServerRoom() {
        System.out.println("есть кондей");
    }

    @Override
    public void printInfo() {
        System.out.println(" офис. Адрес: " + address + " | Площадь: " + area + " кв.м | Кабинетов: " + getRoomCount());
    }
}