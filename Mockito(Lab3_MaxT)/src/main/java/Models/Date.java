package Models;

import java.util.Objects;

public class Date implements InterfaceDate {
    private  int year;
    private  int month;
    private  int day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date() {
        this.year  = (int) (Math.random()*20);
        this.month = (int) (Math.random()*10);
        this.day = (int) (Math.random()*5);
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public int getDay() {
        return day;
    }

    @Override
    public void setDay(int day) {
        this.day = day;
    }

    public void setDays(int day) throws IllegalAccessException {
        throw new IllegalAccessException("Not allowed");
    }

    @Override
    public String toString() {
        return "Date\n{" +
                "\nyear = " + year +
                ", \nmonth = " + month +
                ", \nday = " + day +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return year == date.year &&
                month == date.month &&
                day == date.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    public int getQuantityDay(){
        return this.day+this.month*30+this.year*365;
    }

    public int getQuantityMonth(){
        return (this.day+this.month*30+this.year*365)/30;
    }

    public int getQuantityYear(){
        return (this.day+this.month*30+this.year*365)/365;
    }


}
