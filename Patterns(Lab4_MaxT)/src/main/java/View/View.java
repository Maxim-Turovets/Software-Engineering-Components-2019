package View;

import Models.Date;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

    public  void  printValue(String value)
    {
        System.out.println(value);
    }

    public int enterYear() {
        System.out.println("Enter year :");
        Scanner scanner = new Scanner(System.in);
        try {
            int localVar = scanner.nextInt();
            return  localVar;
        }
        catch (InputMismatchException e) {
            System.err.println("Enter please number");
        }
        return 0;
    }

    public int enterMonth() {
        System.out.println("Enter month :");
        Scanner scanner = new Scanner(System.in);
        try {
            int localVar = scanner.nextInt();
            return  localVar;
        }
        catch (InputMismatchException e) {
            System.err.println("Enter please number");
        }
        return 0;
    }

    public int enterDay() {
        System.out.println("Enter day :");
        Scanner scanner = new Scanner(System.in);
        try {
            int localVar = scanner.nextInt();
            return  localVar;
        }
        catch (InputMismatchException e) {
            System.err.println("Enter please number");
        }
        return 0;
    }

    public  Date printObject( Date date)
    {
        System.out.println(date.toString());
        return date;
    }

    public String printQuantityDay(int quantity)
    {
        System.out.println("In date quantity day :"+quantity);
        return  "In date quantity month :"+quantity;
    }
    public String printQuantitiMonth(int quantity)
    {
        System.out.println("In date quantity month :"+quantity);
        return "In date quantity month :" +quantity;
    }

    public void printQuantitiYear(int quantity)
    {
        System.out.println("In date quantity year :"+quantity);
    }

}
