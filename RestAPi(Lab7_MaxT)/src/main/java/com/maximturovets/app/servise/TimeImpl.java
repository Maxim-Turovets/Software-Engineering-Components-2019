package com.maximturovets.app.servise;

import com.maximturovets.app.models.Time;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimeImpl implements  InterfaceDate {

    List<Time> listTime = new ArrayList<>();

    @Override
    public String showDate() {
        return toString();
    }

    @Override
    public boolean addToList(InterfaceDate object) {
        listTime.add((Time) object);
        return   true;
    }

    @Override
    public boolean deleteToList(InterfaceDate object) {
        listTime.remove(object);
        return  true;
    }
}
