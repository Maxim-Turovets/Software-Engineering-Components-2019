package controllers;

import Models.Date;
import View.View;


public class Controller {
    Date model;
    View view;

    public Controller(Date model, View view) {
        this.model = model;
        this.view = view;
    }

    public void init(){
        this.model.setDay(view.enterDay());
        this.model.setMonth(view.enterMonth());
        this.model.setYear(view.enterYear());
    }


    public Date printInfo() {
        view.printObject(this.model);
        return model;
    }

    public int printQuantityDay() {
        view.printQuantityDay(this.model.getQuantityDay());
        return this.model.getQuantityDay();
    }

    public int printQuantityMonth() {
        view.printQuantitiMonth(this.model.getQuantityMonth());
        return this.model.getQuantityMonth();
    }

    public int printQuantityYear() {
        view.printQuantitiYear(this.model.getQuantityYear());
        return this.model.getQuantityYear();
    }

}
