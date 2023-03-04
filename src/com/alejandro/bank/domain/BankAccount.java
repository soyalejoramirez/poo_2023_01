package com.alejandro.bank.domain;

public class BankAccount {
    public int number;
    public double balance;
    public String type;
    public Person holder;
    public Bank bank;
    public boolean isActive;

    public BankAccount(int number, double balance, String type, Person holder, Bank bank) {
        this(number, type, holder);
        this.balance = balance;
        this.bank = bank;
    }

    public BankAccount(int number, String type, Person holder) {
        this.number = number;
        this.type = type;
        this.holder = holder;
        this.isActive = true;
    }

    public boolean deposit(double moneyToDeposit) {
        if (this.isActive == true) {
            this.balance += moneyToDeposit;
            return true;
        }

        System.out.println("DEPOSIT FAILED. The account is inactive.");
        return false;
    }

    public boolean withdrawals(double moneyToWithdraw) {
        if (this.isActive && this.balance >= moneyToWithdraw) {
            this.balance -= moneyToWithdraw;
            return true;
        }

        return false;
    }

    public boolean transfer(BankAccount destAccount, double moneyToTransfer) {
        boolean successfulWithdraw = this.withdrawals(moneyToTransfer);

        if (successfulWithdraw) {
            boolean successfullyDeposit = destAccount.deposit(moneyToTransfer);

            if (successfullyDeposit) {
                return true;
            } else {
                this.deposit(moneyToTransfer);
                return false;
            }
        }

        return false;
    }

    public String getBalance() {
        return this.holder.name + ", your balance is $" + this.balance;
    }
}
