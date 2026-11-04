package realestate;

import java.util.ArrayList;
import java.util.List;

public abstract class Building {
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
            rooms.add(new Room("Комната " + i));
        }
    }

    public double getPricePerSquareMeter() {
        return price / area;
    }

    // сколько комнат
    public int getRoomCount() {
        return rooms.size();
    }

    public void increaseArea(double extraArea) {
        this.area += extraArea;
        System.out.println("Площадь увеличена на " + extraArea + " кв.м. Новая площадь: " + this.area);
    }

    // сдавать дом в аренду
    public void rentOut() {
        this.isRented = true;
        System.out.println("Здание по адресу " + address + " сдано в аренду!");
    }

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