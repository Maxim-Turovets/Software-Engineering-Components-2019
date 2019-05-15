import Models.*;
import View.View;
import controllers.Controller;

public class Main {

  public static void main(String[] args) {

    Date model = new Date();
    View view = new View();
    Controller controller = new Controller(model,view);
    controller.printInfo();
    controller.init();
    controller.printQuantityDay();
    controller.printQuantityMonth();
    controller.printQuantityYear();

  }


}
