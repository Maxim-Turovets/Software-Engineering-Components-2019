package controllers;

import Models.Date;
import View.View;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

class ControllerTest {

    int setsInt = 0;

    @Test
    void initTest() {
        View view = mock(View.class);
        Date date = mock(Date.class);

        when(view.enterDay()).thenReturn(setsInt);
        when(view.enterMonth()).thenReturn(setsInt);
        when(view.enterYear()).thenReturn(setsInt);
        when(view.printObject(date)).thenReturn(date);

        Controller controller = new Controller(date, view);
        controller.init();

        ReflectionTestUtils.setField(date, "day", setsInt, Integer.TYPE);
        ReflectionTestUtils.setField(date, "month", setsInt, Integer.TYPE);
        ReflectionTestUtils.setField(date, "year", setsInt, Integer.TYPE);


        verify(date).setDay(setsInt);
        verify(date).setYear(setsInt);
        verify(date).setMonth(setsInt);

        int expectedResult = setsInt;
        int actualResult = date.getDay();


    }

    @Test
    void QuantityDay() {
        View view = mock(View.class);
        Date date = mock(Date.class);
        date.setDay(anyInt());

        when(date.getQuantityDay()).thenReturn(anyInt());
        when(view.printQuantityDay(date.getDay())).thenReturn(anyString());

        Controller controller = new Controller(date, view);
        controller.printQuantityDay();

        verify(view).printQuantityDay(date.getQuantityDay());
        verify(date).getQuantityDay();

        assertEquals(("In date quantity month :" + date.getDay()), view.printQuantityDay(date.getQuantityDay()));

    }


    @Test
    void QuantityMonth() {
        View view = mock(View.class);
        Date date = mock(Date.class);
        date.setMonth(anyInt());

        when(date.getQuantityMonth()).thenReturn(anyInt());
        when(view.printQuantitiMonth(date.getMonth())).thenReturn(anyString());

        Controller controller = new Controller(date, view);
        controller.printQuantityDay();

        verify(view).printQuantityDay(date.getQuantityDay());
        verify(date).getQuantityDay();

        assertEquals(("In date quantity month :"+ date.getMonth()), view.printQuantitiMonth(date.getQuantityMonth()));

    }


    @Test
    void PrintInfoObject() {
        View view = mock(View.class);
        Date date = mock(Date.class);

        when(date.toString()).thenReturn(date.toString());
        when(view.printObject(date)).thenReturn(date);

        Controller controller = new Controller(date,view);
        controller.printInfo();

        verify(date.toString());
        verify(view.printObject(date));

        assertEquals(view.printObject(date),date);
        assertEquals(controller.printInfo(),date.toString());

    }
}