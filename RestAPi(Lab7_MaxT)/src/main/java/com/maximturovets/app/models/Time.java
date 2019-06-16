package com.maximturovets.app.models;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Prototype pattern
 */

public class Time extends LocalDate implements  Cloneable{

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    @Override
    protected Time clone() throws CloneNotSupportedException {
        return (Time)super.clone();
    }
}
