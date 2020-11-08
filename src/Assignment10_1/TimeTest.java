package Assignment10_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHourTest() {
        Time time1 = new Time(555550000);
        assertEquals(10, time1.getHour());
    }

    @Test
    void getMinuteTest() {
        Time time2 = new Time(555550000);
        assertEquals(19, time2.getMinute());
    }

    @Test
    void getSecondTest() {
        Time time3 = new Time(555550000);
        assertEquals(10, time3.getSecond());
    }

    @Test
    void setTimeTest() {
        Time time4 = new Time();
        time4.setTime(555550000);
        assertEquals(555550000,time4.getElapsedTime());
    }
}
