package controllers;

import Models.Date;
import Models.InterfaceDate;
import View.View;

import org.springframework.beans.factory.annotation.Autowired;


public class Controller {
    InterfaceDate model;
    View view;


    @Autowired
    public Controller(InterfaceDate model, View view) {
        this.model = model;
        this.view = view;
    }


    public  void printValue()
    {
        view.printValue(model.showDate());
    }

}
