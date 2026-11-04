/*дом. Возможности: построить дом; рассчитать цену за квадратный метр; узнать сколько комнат;
    увеличить площадь; сдавать дом в аренду; сделать ремонт (в какой-либо комнате). Добавить
специализированные методы для Дома, Офисного здания, Торгового центра.*/


package realestate;

public class Main {
    public static void main(String[] args) {
        // 2 комнаты
        House myHouse = new House("ул. Пушкина, д. 10", 120.5, 10_000_000, 2);
        myHouse.printInfo();

        System.out.println("Цена за кв.м: " + myHouse.getPricePerSquareMeter() + " руб.");

        // ремонт в первой комнате (индекс 0)
        myHouse.renovateRoom(0);

        myHouse.rentOut();

        myHouse.buildGarage();

        System.out.println("\n-\n");


        OfficeBuilding office = new OfficeBuilding("Бизнес-центр 'Минск-Сити'", 500.0, 50_000_000, 10);
        office.printInfo();
        office.increaseArea(50.0); // Пристраиваем еще 50 метров
        office.installServerRoom();

        System.out.println("\n-\n");

        ShoppingCenter mall = new ShoppingCenter("ТЦ 'Галерея'", 2000.0, 150_000_000, 50);
        mall.printInfo();
        mall.openFoodCourt();
    }
}