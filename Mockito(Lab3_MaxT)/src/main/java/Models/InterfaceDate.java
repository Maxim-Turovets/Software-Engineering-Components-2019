package Models;


public interface InterfaceDate {
    public int getYear();

    public void setYear(int year);

    public int getMonth();

    public void setMonth(int month);

    public int getDay();

    public void setDay(int day);

    public String toString();

    public boolean equals(Object o);

    public int hashCode();
}
