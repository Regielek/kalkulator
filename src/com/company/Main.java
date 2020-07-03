package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner X = new Scanner(System.in);

        System.out.print("Liczba x: ");
        double x = Double.parseDouble
                (
                        X.nextLine().replace(",", ".")
                );
        System.out.print("Liczba y: ");
        double y = Double.parseDouble
                (
                        X.nextLine().replace(",", ".")
                );

        double z = x + y;

        System.out.println(z);
    }
}

