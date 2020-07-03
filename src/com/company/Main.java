package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner liczbaX = new Scanner(System.in);
        Scanner liczbaY = new Scanner(System.in);

        System.out.print("Liczba x: ");
        int x = liczbaX.nextInt();
        System.out.print("Liczba y: ");
        int y = liczbaY.nextInt();

        int z = x + y;

        System.out.println(z);

    }
}
