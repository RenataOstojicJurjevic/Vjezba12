package com.company;

public class Card {
    double balance;
    double dug;

    public Card(double balance) {
        this.balance = balance;
    }


    public void charge (double balans, double dug) {
        if (balans > dug) {  System.out.println("Napalata izvrsena! Novo stanje racuna: " + (balans - dug));}
        else { System.out.println("Nema dovoljno novaca za naplatu!");}

}
}
