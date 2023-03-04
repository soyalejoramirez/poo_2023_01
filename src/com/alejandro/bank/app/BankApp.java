package com.alejandro.bank.app;

import com.alejandro.bank.domain.BankAccount;
import com.alejandro.bank.domain.Person;

public class BankApp {
    public static void main(String[] args) {
        Person diana = new Person(357, "Diana Monsalve");
        Person alvaro = new Person("Alvaro Restrepo");

        BankAccount dianaAccount = new BankAccount(123, "A", diana);
        BankAccount alvaroAccount = new BankAccount(321, "A", alvaro);

        dianaAccount.deposit(50);

        System.out.println(dianaAccount.getBalance());
        System.out.println(alvaroAccount.getBalance());

        dianaAccount.transfer(alvaroAccount, 20);

        System.out.println(dianaAccount.getBalance());
        System.out.println(alvaroAccount.getBalance());
    }
}