package com.maximturovets.app.controller;

import com.maximturovets.app.servise.TimeImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/time")
public class TimeController {
    private final TimeImpl time;


    public TimeController(TimeImpl time) {
        this.time = time;
    }


    @GetMapping("/addTime")
    public void addTime(@RequestBody TimeImpl time) {
        this.time.addToList(time);
    }

    @GetMapping("/removeTime")
    public void removeTime(@RequestBody TimeImpl time) {
        this.time.deleteToList(time);
    }

    @GetMapping("/showTime")
    public void showTime (@RequestBody TimeImpl time) {
        this.time.showDate();
    }
}
