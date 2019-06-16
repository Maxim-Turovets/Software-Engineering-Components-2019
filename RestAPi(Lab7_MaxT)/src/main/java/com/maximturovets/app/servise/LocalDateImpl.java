package com.maximturovets.app.servise;

import com.maximturovets.app.models.Date;
import com.maximturovets.app.models.LocalDate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocalDateImpl implements InterfaceDate {

    private List<LocalDate> listDate = new ArrayList<>();

    @Override
    public String showDate() {

        return toString();
    }

    @Override
    public boolean addToList(InterfaceDate object) {
        listDate.add((LocalDate) object);
        return true;
    }

    @Override
    public boolean deleteToList(InterfaceDate object) {
        listDate.remove(object);
        return  true;
    }
}
