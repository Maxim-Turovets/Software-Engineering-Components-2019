package ua.MaxT;

import ua.MaxT.Models.Date;
import ua.MaxT.Models.InterfaceDate;
import ua.MaxT.Models.Time;
import ua.MaxT.Models.ValueDate;
import ua.MaxT.Proxy.CustomAnnotation;
import ua.MaxT.Proxy.Immutability;
import java.lang.reflect.*;

public class Main {

  public static void main(String[] args) {
    ValueDate randomValue = new ValueDate();
    Date date = new Date(randomValue.getRandomYear(),
                         randomValue.getRandomMonth(),
                         randomValue.getRandomday());

    Time time = new Time(randomValue.getRandomYear(),
                         randomValue.getRandomMonth(),
                         randomValue.getRandomday(),
                         randomValue.getRandomday(),
                         randomValue.getRandomMonth());

    ClassInfo(time.getClass());
    System.out.print("Constructor - ");getConstructorWithParameters(Time.class, CustomAnnotation.class, null);

    ClassInfo(date.getClass());
    System.out.print("Constructor - ");
    getConstructorWithParameters(Date.class, CustomAnnotation.class, date);




    immutabilityInvokation(date, date.getClass());
  }


  // Get constructor with parameters
  private static void getConstructorWithParameters(Class clazz, Class annotation, Object obj) {

    Constructor[] constructors = clazz.getConstructors();
    for (Constructor constructor : constructors) {
        Class[] paramTypes = constructor.getParameterTypes();
        for (Class paramType : paramTypes) {
          System.out.print(paramType.getName() + " ");
      }
      System.out.println();
    }
  }

  private static void immutabilityInvokation(Date date, Class clazz) {
    InterfaceDate dateproxy = (InterfaceDate) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new Immutability(date));
    var value = dateproxy.getDay();
    try {
      date.setDay(value);
    } catch (Exception e) {
      System.out.print(e.getMessage() + "\n");
    }
  }

  private static void ClassInfo(Class clazz) {
    System.out.println("Class name = " + clazz.getSimpleName());
    System.out.println("Modifiers name = " + clazz.getModifiers());
    }



}
