package realestate;

public interface IBuilding {
    double getPricePerSquareMeter();
    int getRoomCount();
    void increaseArea(double extraArea);
    void rentOut();
    void renovateRoom(int roomIndex);
}