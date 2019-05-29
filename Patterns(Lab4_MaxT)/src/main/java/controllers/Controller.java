package controllers;

import Models.Date;
import Models.InterfaceDate;
import View.View;


public class Controller {
    InterfaceDate model;
    View view;

    public Controller(InterfaceDate model, View view) {
        this.model = model;
        this.view = view;
    }


    public  void printValue()
    {
        view.printValue(model.showDate());
    }

}
