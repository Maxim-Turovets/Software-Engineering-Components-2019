package ua.MaxT.Models;

public class ValueDate {
    private  double randomYear;
    private  double randomMonth;
    private  double randomDay;

    public void setRandomYear(double randomYear) {
        this.randomYear = randomYear;
    }

    public void setRandomMonth(double randomMonth) {
        this.randomMonth = randomMonth;
    }

    public void setRandomday(double randomday) {
        this.randomDay = randomday;
    }

    public int getRandomYear() {
        int temp;
        randomYear = (Math.random()*1000)+1000;
        temp=(int)randomYear;
        return temp;
    }

    public int getRandomMonth() {
        int temp;
        randomMonth = (Math.random()*12);
        temp=(int)randomMonth;
        return temp;
    }

    public int getRandomday() {
        int temp;
        randomDay = Math.random()*7;
        temp=(int)randomDay;
        return temp;
    }
}
