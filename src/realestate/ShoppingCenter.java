package realestate;

public class ShoppingCenter extends Building {
    public ShoppingCenter(String address, double area, double price, int roomCount) {
        super(address, area, price, roomCount);
    }

    public void openFoodCourt() {
        System.out.println("В ТЦ открыт фудкорт с бургерами!");
    }

    @Override
    public void printInfo() {
        System.out.println(" ТЦ. Адрес: " + address + " | Площадь: " + area + " кв.м | Магазинов: " + getRoomCount());
    }
}