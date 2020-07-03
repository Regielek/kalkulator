package com.company;

import java.util.Scanner;

public class Main
{
    public static double getValue(String v)
    {
        double x, y, addition;
        //subtraction, multilication, division;
        x = y = 0;

        boolean a;
        a = true;

        Scanner X = new Scanner(System.in);

        do
        {
            try
            {
                System.out.print("Podaj liczbę " + v + ": ");
                x = Double.parseDouble
                        (
                                X.nextLine().replace(",", ".")
                        );
                a = false;
            } catch (NumberFormatException e)
            {
                System.out.println("To nie jest liczba! ");
                a = true;
            }
        }while (a);

        return x;
    }

    public static void main(String[] args)
    {
       double x, y;

       x = getValue("x");
       y = getValue("y");

       double z = x + y;
       System.out.println("Suma: " +z);
    }
}