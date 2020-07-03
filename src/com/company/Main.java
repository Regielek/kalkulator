package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double x, y, z;
        x = y = 0;

        boolean a, b;
        a = b = true;

        Scanner X = new Scanner(System.in);

        System.out.print("Liczba x: ");

        do
            {
        try
        {
            x = Double.parseDouble
                    (
                            X.nextLine().replace(",", ".")
                    );
            a = false;
        } catch (NumberFormatException e)
        {
            System.out.println("To nie jest liczba! ");
            a = true;
            System.out.print("Liczba x: ");
        }
            }while (a);

        System.out.print("Liczba y: ");

        do
            {
        try
        {
            y = Double.parseDouble
                    (
                            X.nextLine().replace(",", ".")
                    );
            b = false;
        } catch (NumberFormatException e)
        {
            System.out.println("To nie jest liczba! ");
            b = true;
            System.out.print("Liczba y: ");
        }
            }while(b);

        z = x + y;

        System.out.println(z);
    }
}

