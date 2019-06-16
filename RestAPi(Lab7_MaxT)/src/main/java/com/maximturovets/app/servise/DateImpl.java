package com.maximturovets.app.servise;

import com.maximturovets.app.models.Date;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DateImpl implements InterfaceDate {

    private List<Date> listDate = new ArrayList<>();


    @Override
    public String showDate() {
        return toString();
    }

    @Override
    public boolean addToList(InterfaceDate object) {
        this.listDate.add((Date) object);
        return true;
    }

    @Override
    public boolean deleteToList(InterfaceDate object) {
        this.listDate.remove(object);
        return true;
    }
}
