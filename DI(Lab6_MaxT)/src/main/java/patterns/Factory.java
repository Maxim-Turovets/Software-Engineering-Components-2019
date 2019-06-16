package patterns;

import Models.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Factory pattern
 */
public class Factory {


    public static InterfaceDate create(String typeOfDate) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        switch (typeOfDate) {
            case "Date":
                return context.getBean("dateBean", Date.class);
            case "LocalDate":
                return context.getBean("localDateBean", LocalDate.class);
            case "ExTime":
                return context.getBean("exTimeBean", ExTime.class);
            default:
                return null;
        }
    }
}
