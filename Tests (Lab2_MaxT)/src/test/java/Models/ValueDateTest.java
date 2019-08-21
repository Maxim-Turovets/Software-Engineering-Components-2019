package Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueDateTest {
    ValueDate valueDate = new ValueDate();
    @Test
    public void getRandomYear() {
        double randomYear = (Math.random()*1000)+1000;
        assertNotEquals(valueDate.getRandomYear(),randomYear);
    }

    @Test
    public void getRandomMonth() {
        double randomMonth = (Math.random()*1000)+1000;
        assertNotEquals(valueDate.getRandomMonth(),randomMonth);
    }

    @Test
    public void getRandomDay() {
        double randomDay = (Math.random()*1000)+1000;
        assertNotEquals(valueDate.getRandomday(),randomDay);
    }


}