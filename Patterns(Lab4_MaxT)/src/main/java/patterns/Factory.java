package patterns;

import Models.Date;
import Models.InterfaceDate;
import Models.LocalDate;
import Models.Time;

/**
 * Factory pattern
 */
public class Factory  {

    public  static  InterfaceDate create(String typeOfDate) {
        switch (typeOfDate) {
            case "Date":
                return new Date();
            case "LocalDate":
                return new LocalDate();
            case "Time":
                return new Time();
            case "Singleton":
                return new Singleton();
            default:
                return null;
        }
    }
}
