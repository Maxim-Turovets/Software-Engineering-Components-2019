import Models.*;
import Proxy.Immutability;
import View.View;
import controllers.Controller;
import patterns.DateContainer;
import Models.ExTime;
import patterns.Iterator;

public class Main {

  /**
   *  Factory
   *  Prototype
   *  Singleton
   *  Iterator
   *  Proxy
   */
  public static void main(String[] args) {

    DateContainer dateContainer = new DateContainer();
    Iterator iterator = dateContainer.getIterator();

    View view = new View();

    /**
     * Iterator
     */
    while (iterator.hasNext()){
      Controller controller = new Controller(iterator.next(),view);
      controller.printValue();
     }

     ExTime exTime = new ExTime();
    Immutability immutability = new Immutability(exTime);



  }


}
