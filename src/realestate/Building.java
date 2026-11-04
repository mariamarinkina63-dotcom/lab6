package realestate;

import java.util.ArrayList;
import java.util.List;

public abstract class Building implements IBuilding {
    protected String address;
    protected double area;
    protected double price;
    protected boolean isRented;
    protected List<Room> rooms;

    public Building(String address, double area, double price, int roomCount) {
        this.address = address;
        this.area = area;
        this.price = price;
        this.isRented = false;
        this.rooms = new ArrayList<>();

        for (int i = 1; i <= roomCount; i++) {
            rooms.add(new Room("комната " + i));
        }
    }

    @Override // Добавляем аннотацию, так как метод теперь из интерфейса
    public double getPricePerSquareMeter() {
        return price / area;
    }

    // сколько комнат
    @Override
    public int getRoomCount() {
        return rooms.size();
    }

    @Override
    public void increaseArea(double extraArea) {
        this.area += extraArea;
        System.out.println("Площадь увеличена на " + extraArea + " кв.м. Новая площадь: " + this.area);
    }

    // сдавать дом в аренду
    @Override
    public void rentOut() {
        this.isRented = true;
        System.out.println("Здание по адресу " + address + " сдано в аренду!");
    }

    @Override
    public void renovateRoom(int roomIndex) {
        if (roomIndex >= 0 && roomIndex < rooms.size()) {
            rooms.get(roomIndex).makeRenovation();
            System.out.println("В комнате '" + rooms.get(roomIndex).getName() + "' сделан ремонт!");
        } else {
            System.out.println("Ошибка: такой комнаты нет.");
        }
    }

    public abstract void printInfo();
}