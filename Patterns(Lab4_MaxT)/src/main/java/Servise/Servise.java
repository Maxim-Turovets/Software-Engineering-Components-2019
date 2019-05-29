package Servise;

import Models.Date;
import View.View;

public class Servise {

    public int getQuantityDay(){
        Date date = new Date();
        return date.getDay()+date.getMonth()*30+date.getYear()*365;
    }

    public int getQuantityMonth(){
        Date date = new Date();
        return (date.getDay()+date.getMonth()*30+date.getYear()*365)/30;
    }

    public int getQuantityYear(){
        Date date = new Date();
        return (date.getDay()+date.getMonth()*30+date.getYear()*365)/365;
    }
}
