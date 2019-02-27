package ua.MaxT.Models;

import java.util.Objects;

public interface InterfaceTime {

    public int getHour();

    public void setHour(int hour);

    public int getMinutes();

    public void setMinutes(int minutes);

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();

    @Override
    public String toString();
}
