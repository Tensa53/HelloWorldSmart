package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("0.Inglese \n1.Italiano");

        int s = in.nextInt();

        if (s == 1)
            System.out.println("Ciao Mondo !");
        else
            System.out.println("Hello World !");

    }
}