package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double balance = 250.00;

        Scanner sc = new Scanner(System.in);
        Card kartica = new Card(balance);
        System.out.println("Stanje na računu: " +kartica.balance);
        System.out.println("Unesite dug: ");
        kartica.dug = sc.nextDouble();
        kartica.charge(kartica.balance,kartica.dug );
    }
}
