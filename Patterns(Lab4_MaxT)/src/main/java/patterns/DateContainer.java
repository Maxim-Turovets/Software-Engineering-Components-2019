package patterns;

import Models.InterfaceDate;

public class DateContainer implements  Container {

    InterfaceDate[] dateMass = {Factory.create("Date"), Factory.create("Time"), Factory.create("LocalDate"),Factory.create("Singleton")};

    @Override
    public Iterator getIterator() {
        return  new ArrayIterator();
    }

    class ArrayIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return (index < dateMass.length) ? true : false;
        }

        @Override
        public InterfaceDate next() {
            if (hasNext())
                return dateMass[index++];
                return null;

        }
    }
}

