package patterns;

import Models.InterfaceDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Singleton  implements InterfaceDate {


    private  DateFormat dateFormat = new SimpleDateFormat("yyyy");
    private  Date date = new Date();

    static  Singleton singleton = new Singleton();

    private Singleton(){}

    private   static  Singleton getInstance(){
        return  singleton;
    }

    @Override
    public String showDate() {
        return dateFormat.format(date);
    }
}
