package ua.MaxT.Models;

import java.util.Objects;

public class Time extends Date implements InterfaceTime{

    private int hour;
    private int minutes;
    public final static  int  MIN_VALUE = 0;
    public final static  int  MAX_VALUE = 24;


    public Time(int year, int month, int day, int hour, int minutes) {
        super(year, month, day);
        this.hour = hour;
        this.minutes = minutes;
    }

    @Override
    public int getHour() {
        return hour;
    }

    @Override
    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }

    @Override
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Time time = (Time) o;
        return hour == time.hour &&
                minutes == time.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hour, minutes);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                '}';
    }


}
