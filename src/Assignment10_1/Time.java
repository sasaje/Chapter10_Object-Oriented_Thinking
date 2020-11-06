/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 03/11/2020
 *
 */

package Sara;

/*
* A data fields hour, minute and second that represent a time.
* No-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.).
* A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. (The values of the data fields will represent this time.)
* A constructor that constructs a Time object with the specified hour, minute, and second.
* Three getter methods for the data fields hour, minute and second, respectively.
* A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, minute is 19 and the second is 10.
*/

import java.util.Calendar;

public class Time {
    private int hour;
    private int minute;
    private int second;
    long elapsedTime = System.currentTimeMillis() / 1000l;

    // Getter for hour
    public int getHour() {
//        return hour;
        return (int)((elapsedTime / (1000*60*60)) % 24);
    }
    // Getter for minute
    public int getMinute() {
//        return minute;
        return (int)((elapsedTime / (1000*60)) % 60);
    }
    // Getter for second
    public int getSecond() {
//        return second;
        return (int)(elapsedTime / 1000) % 60 ;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    // No-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.).
    Time(){
        // new Calendar object
        Calendar now = Calendar.getInstance();

        //declare values of variables to current time on the object now
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);
    }

    // A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. (The values of the data fields will represent this time.)
    Time(long elapsedTime){
        this.elapsedTime = elapsedTime;
    }

    // A constructor that constructs a Time object with the specified hour, minute, and second.
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
        Time newElapsedTime = new Time(currentTime.elapsedTime);
        System.out.println("Since 1 January 1970");
        System.out.println("- Elapsed time in milliseconds: " + newElapsedTime.elapsedTime);

        System.out.println("");

        //show the constructor with the specified hour, minute, second
        System.out.println("The specified constructor: ");
        Time specified = new Time();
        specified.hour = 10;
        specified.minute = 2;
        specified.second = 55;
        Time specifiedTime = new Time(specified.hour, specified.minute, specified.second);
        System.out.println("- The specifiedTime hour: " + specifiedTime.getHour());
        System.out.println("- The specifiedTime minute: " + specifiedTime.getMinute());
        System.out.println("- The specifiedTime second: " + specifiedTime.getSecond());

        System.out.println("");


        System.out.println("Method run setTime()");
        Time newTime = new Time(555550000);
        newTime.setTime(555550000);
        System.out.println("- ElapseTime hours: " + newTime.getHour());
        System.out.println("- ElapseTime minutes: " + newTime.getMinute());
        System.out.println("- ElapseTime seconds: " + newTime.getSecond());
    }

    // A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. For example,
    // if the elapsed time is 555550000 milliseconds, the hour is 10, minute is 19 and the second is 10.
    public void setTime(long elapsedTime){
        this.elapsedTime = elapsedTime;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
