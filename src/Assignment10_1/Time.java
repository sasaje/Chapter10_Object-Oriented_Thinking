/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 03/11/2020
 *
 */

package Assignment10_1;

/*
* A data fields hour, minute and second that represent a time.
* No-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.).
* A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. (The values of the data fields will represent this time.)
* A constructor that constructs a Time object with the specified hour, minute, and second.
* Three getter methods for the data fields hour, minute and second, respectively.
* A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, minute is 19 and the second is 10.
*/

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Time {
    int hour;
    int minute;
    int second;
    int elapsedMillisecond = Calendar.MILLISECOND;

    // No-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.).
    Time(){
        // new Time object
        Calendar now = Calendar.getInstance();

        //declare values of variables to current time
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);
    }

    // A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. (The values of the data fields will represent this time.)
    Time(long elapsedMillisecond, long elapsedMinute, long elapsedSecond){
        //create new object of the type Calendar
       Calendar now = Calendar.getInstance();
        Time elapsedTime = new Time();

        long elapsedHour = TimeUnit.MILLISECONDS.toHours(elapsedMillisecond);
        long elapsedMinutes = TimeUnit.MILLISECONDS.toMinutes(elapsedMillisecond);
        long elapsedSeconds = TimeUnit.MILLISECONDS.toSeconds(elapsedMillisecond);
    }

    public static void main(String[] args) {
        //create new object of the type Time
        Time currentTime = new Time();
        System.out.println("Current time:");
        System.out.println("- Hour: " + currentTime.hour);
        System.out.println("- Minute: " + currentTime.minute);
        System.out.println("- Second: " + currentTime.second);

        System.out.println("");

        //show the constructor with elapsed time since 1 January 1970.
        Time elapsedTime = new Time();
        System.out.println("Since 1 January 1970");

        System.out.println("- Elapsed hours: " + elapsedTime.elapsedMillisecond);
        System.out.println("- Elapsed minute: " + elapsedTime.minute);
        System.out.println("- Elapsed second: " + elapsedTime.second);
    }

}
