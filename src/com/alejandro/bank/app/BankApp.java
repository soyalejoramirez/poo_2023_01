package com.alejandro.bank.app;

import com.alejandro.bank.domain.BankAccount;
import com.alejandro.bank.domain.Person;

public class BankApp {
    public static void main(String[] args) {
        Person diana = new Person();
        diana.id = 357;
        diana.name = "Diana Monsalve";

        Person alvaro = new Person();
        alvaro.id = 149;
        alvaro.name = "Alvaro Restrepo";

        BankAccount dianaAccount = new BankAccount();
        dianaAccount.holder = diana;
        dianaAccount.isActive = true;

        BankAccount alvaroAccount = new BankAccount();
        alvaroAccount.holder = alvaro;
        alvaroAccount.isActive = true;

        dianaAccount.deposit(50);

        System.out.println(dianaAccount.getBalance());
        System.out.println(alvaroAccount.getBalance());

        dianaAccount.transfer(alvaroAccount, 20);

        System.out.println(dianaAccount.getBalance());
        System.out.println(alvaroAccount.getBalance());
    }
}