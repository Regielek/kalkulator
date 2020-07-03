package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner X = new Scanner(System.in);
        Scanner Y = new Scanner(System.in);

        System.out.print("Liczba x: ");
        String tmp = X.nextLine().replace(",", ".");
        double x = Double.parseDouble(tmp);
        System.out.print("Liczba y: ");
        String tmp2 = X.nextLine().replace(",", ".");
        double y = Double.parseDouble(tmp2);

        double z = x + y;

        System.out.println(z);
    }
}
