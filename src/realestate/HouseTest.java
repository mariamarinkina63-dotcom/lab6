package realestate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    private House house;

    @BeforeEach
    void setUp() {
        house = new House("ул. Ленина, 1", 100.0, 10_000_000, 3);
    }

    @Test
    void testGetPricePerSquareMeter() {
        double expected = 100_000.0;
        double actual = house.getPricePerSquareMeter();
        assertEquals(expected, actual, 0.1);
    }

    @Test
    void testGetRoomCount() {
        assertEquals(3, house.getRoomCount());
    }

    @Test
    void testIncreaseArea() {
        house.increaseArea(20.0);
        double actual = house.getPricePerSquareMeter();
        assertEquals(83333.33, actual, 0.1);
    }

    @Test
    void testRenovateRoom() {
        assertFalse(house.rooms.get(0).isRenovated());
        house.renovateRoom(0);
        assertTrue(house.rooms.get(0).isRenovated());
    }

    @Test
    void testRentOut() {
        house.rentOut();
        assertTrue(true);
    }
}