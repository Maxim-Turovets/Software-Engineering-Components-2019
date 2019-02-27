package ua.MaxT.Models;

import java.util.Objects;

public interface InterfaceTime {

    public int getHour();

    public void setHour(int hour);

    public int getMinutes();

    public void setMinutes(int minutes);

    public boolean equals(Object o);

    public int hashCode();

    public String toString();
}
