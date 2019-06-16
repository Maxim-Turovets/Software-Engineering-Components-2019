package Models;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class LocalDate implements InterfaceDate{


    protected Date date = new Date();

    @Override
    public String showDate() {
        return date.toString();
    }
}
