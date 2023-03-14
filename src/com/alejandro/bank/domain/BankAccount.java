package com.alejandro.bank.domain;

public class BankAccount {
    private int number;
    private double balance;
    private String type;
    private Person holder;
    private Bank bank;
    private boolean isActive;

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

    public String getMessageBalance() {
        return this.holder.getName() + ", your balance is $" + this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public Person getHolder() {
        return holder;
    }

    public Bank getBank() {
        return bank;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
