package Models;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class TimeTest {
    Time time = new Time();
    @Before
    public  void  initTime()
    {
        time.setHour(1);
        time.setMinutes(1);
        time.setDay(1);
        time.setMonth(1);
        time.setYear(1);
    }


    @Test
    public void setYear_Time()
    {
        int res = 1;
        time.setYear(1);
        assertEquals(res,time.getYear());
    }
    @Test
    public void setMonth_Time()
    {
        int res = 1;
        time.setMonth(1);
        assertEquals(res,time.getMonth());
    }
    @Test
    public void setDay_Time()
    {
        int res = 1;
        time.setDay(1);
        assertEquals(res,time.getDay());
    }
    @Test
    public void setHour_Time()
    {
        int res = 1;
        time.setHour(1);
        assertEquals(res,time.getHour());
    }
    @Test
    public void setMinute_Time()
    {
        int res = 1;
        time.setMinutes(1);
        assertEquals(res,time.getMinutes());
    }

    @Test
    public void getYear_Time()
    {
        int res = 1;
        initTime();
        assertEquals(1,time.getYear());
    }
    @Test
    public void getMonth_Time()
    {
        int res = 1;
        initTime();
        assertEquals(1,time.getMonth());
    }
    @Test
    public void getDay_Time()
    {
        int res = 1;
        initTime();
        assertEquals(1,time.getDay());
    }
    @Test
    public void getMinutes_Time()
    {
        int res = 1;
        initTime();
        assertEquals(1,time.getMinutes());
    }
    @Test
    public void getHour_Time()
    {
        int res = 1;
        initTime();
        assertEquals(1,time.getHour());
    }
    @Test
    public void eqalseObject_Time(){
        Time res_time = new Time (1,1,1,1,1);
        initTime();
        assertEquals(time, res_time);
    }
    @Test
    public void  toString_Date(){
        String str = "Time{" + "hour=" + 1 + ", minutes=" + 1 + '}';
        initTime();
        assertEquals(str,time.toString());
    }
}