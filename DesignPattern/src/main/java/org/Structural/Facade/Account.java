package org.Structural.Facade;

class Account {
    private int accountNumber;
    private int balance;

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " from Account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in Account " + accountNumber);
        }
    }
}