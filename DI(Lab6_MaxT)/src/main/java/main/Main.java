package main;
import Models.Date;
import View.View;
import controllers.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


  public static void main(String[] args) {



      ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
      View view = ctx.getBean("view", View.class);

      Controller controller =  ctx.getBean("controller", Controller.class);
      Date date = ctx.getBean("model",Date.class);
      controller.printValue();

  }


}
