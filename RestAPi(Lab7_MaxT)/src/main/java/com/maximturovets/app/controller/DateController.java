package com.maximturovets.app.controller;

import com.maximturovets.app.servise.DateImpl;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/date")
public class DateController {

    private final DateImpl date;

    public DateController(DateImpl date) {
        this.date = date;
    }


    @GetMapping("/addDate")
    public void addDate(@RequestBody DateImpl date) {
        this.date.addToList(date);
    }

    @GetMapping("/removeDate")
    public void removeDate(@RequestBody DateImpl date) {
        this.date.deleteToList(date);
    }

    @GetMapping("/showDate")
    public void showDate (@RequestBody DateImpl date) {
        this.date.showDate();
    }
}
