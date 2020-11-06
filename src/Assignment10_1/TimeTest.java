package Assignment10_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHourTest() {
        Time time1 = new Time();
        time1.freezeTime();
        time1.getHour();
        System.out.println(time1);
        assertEquals(13, time1.getHour());
    }

    @Test
    // OBS! denne kan ikke testes
    void getMinuteTest() {
        Time time2 = new Time();
        time2.freezeTime();
        time2.getMinute();
        assertEquals(44, time2.getMinute());
    }

    @Test
    // OBS! denne kan ikke testes
    void getSecondTest() {
        Time time3 = new Time();
//        time3.freezeTime();
        time3.getSecond();
        assertEquals(23, time3.getSecond());
    }

    @Test
    // OBS! denne kan ikke testes
    void setTimeTest() {
        Time time4 = new Time();
        time4.setTime(555550000);
        assertEquals(555550000,time4.getElapsedTime());
    }
}