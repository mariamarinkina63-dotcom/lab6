package realestate;

public class OfficeBuilding extends Building {
    public OfficeBuilding(String address, double area, double price, int roomCount) {
        super(address, area, price, roomCount);
    }

    public void installServerRoom() {
        System.out.println("В офисе установлена серверная с охлаждением.");
    }

    @Override
    public void printInfo() {
        System.out.println(" ОФИС. Адрес: " + address + " | Площадь: " + area + " кв.м | Кабинетов: " + getRoomCount());
    }
}