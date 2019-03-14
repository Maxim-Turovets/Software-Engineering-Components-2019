

import Models.Date;
import Models.InterfaceDate;
import Models.Time;
import Models.ValueDate;
import  Proxy.CustomAnnotation;
import  Proxy.Immutability;
import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;

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
     Date o = new Date();

    try {
      o.setDay(dateproxy.getDay());
      dateproxy.setDay(o.getDay());
    } catch (Exception e) {
      System.err.println(e.getCause());
    }
  }

  private static void ClassInfo(Class clazz) {
    System.out.println("Class name = " + clazz.getSimpleName());
    System.out.println("Modifiers name = " + clazz.getModifiers());
    }



}
