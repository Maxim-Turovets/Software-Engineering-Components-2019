package Models;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import  Proxy.Immutability;

import java.lang.reflect.Proxy;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date date=new Date();
    InterfaceDate proxydate;

    @Before
    public void initDate() {
        date.setDay(12);
        date.setMonth(5);
        date.setYear(1999);
        proxydate = (InterfaceDate) Proxy.newProxyInstance(date.getClass().getClassLoader(), date.getClass().getInterfaces(), new Immutability(date));
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void setLeftWithProxyTest()
    {
        proxydate.setDay(1);
    }

    @Test
    public void getDay_Date()
    {
        initDate();
        int day =12;
        int day_result = date.getDay();
        assertEquals(day, day_result);
    }
    @Test
    public void getYear_Date()
    {
        initDate();
        int year =1999;
        int year_result = date.getYear();
        assertEquals(year, year_result);
    }
    @Test
    public void getMonth_Date()
    {
        initDate();
        int month =5;
        int month_result = date.getMonth();
        assertEquals(month, month_result);
    }
    @Test
    public void setDay_Date()
    {
        int day = 12;
        date.setDay(12);
        assertEquals(day, date.getDay());
    }
    @Test
    public void setMonth_Date()
    {
        int month = 5;
        date.setMonth(5);
        assertEquals(month, date.getMonth());
    }
    @Test
    public void setYear_Date()
    {
        int year = 1999;
        date.setYear(1999);
        assertEquals(year, date.getYear());
    }
    @Test
    public void eqalseObject_Date(){
        Date res_date = new Date (1992,5,12);
        initDate();
        assertNotEquals(date, res_date);
    }
    @Test
    public void  constructor_Date(){
        Date res_date = new Date (1999,5,12);
        initDate();
        assertEquals(res_date,date);
    }

}