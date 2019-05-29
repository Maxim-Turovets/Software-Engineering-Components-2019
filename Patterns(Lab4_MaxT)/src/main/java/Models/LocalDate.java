package Models;

import java.util.Date;
public class LocalDate implements InterfaceDate{


    protected Date date = new Date();

    @Override
    public String showDate() {
        return date.toString();
    }
}
