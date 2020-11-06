package Sara;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHourTest() {
        Time time1 = new Time(555550000);
        assertEquals(10, time1.getHour());
    }

    @Test
    // OBS! denne kan ikke testes
    void getMinuteTest() {
        Time time2 = new Time(555550000);
        assertEquals(19, time2.getMinute());
    }

    @Test
    // OBS! denne kan ikke testes
    void getSecondTest() {
        Time time3 = new Time(555550000);
        assertEquals(10, time3.getSecond());
    }

    @Test
    // OBS! denne kan ikke testes
    void setTimeTest() {
        Time time4 = new Time();
        time4.setTime(555550000);
        assertEquals(555550000,time4.getElapsedTime());
    }
}
