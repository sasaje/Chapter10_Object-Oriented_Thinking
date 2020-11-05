package Assignment10_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time1 = new Time();
        time1.getHour();
        assertEquals(13, time1.getHour());
    }

    @Test
    // OBS! denne kan ikke testes
    void getMinute() {
        Time time2 = new Time();
        time2.getMinute();
        assertEquals(42, time2.getMinute());
    }

    @Test
    // OBS! denne kan ikke testes
    void getSecond() {
        Time time3 = new Time();
        time3.getSecond();
        assertEquals(5, time3.getSecond());
    }

    @Test
    // OBS! denne kan ikke testes
    void setTime() {
        Time time4 = new Time();
        time4.setTime(555550000);
        assertEquals(555550000,time4.getElapsedTime());
    }
}