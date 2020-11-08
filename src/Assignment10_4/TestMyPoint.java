package Assignment10_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMyPoint {

    @Test
    void testGetX() {
        MyPoint point1 = new MyPoint();
        point1.setX(5);
        assertEquals(5, point1.getX());
    }

    @Test
    void testGetY() {
        MyPoint point2 = new MyPoint();
        point2.setY(7);
        assertEquals(7, point2.getY());
    }

    @Test
    void testDistanceConstructorDouble() {
        MyPoint point3 = new MyPoint(4, 5);
        point3.distance(4, 5);
        assertEquals(0, point3.distance(4, 5));
    }
}