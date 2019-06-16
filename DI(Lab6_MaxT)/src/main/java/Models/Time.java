package Models;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Prototype pattern
 */
@Component
public class Time extends LocalDate implements InterfaceDate, Cloneable{

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Override
    public String showDate() {
        return dateFormat.format(super.date);
    }

    @Override
    protected Time clone() throws CloneNotSupportedException {
        return (Time)super.clone();
    }
}
