package org.Structural.Facade;

class Transaction {
    public boolean transfer(Account fromAccount, Account toAccount, int amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.withdraw(-amount); // Deposit into the destination account
            return true;
        } else {
            System.out.println("Transfer failed: Insufficient balance in Account " + fromAccount.getAccountNumber());
            return false;
        }
    }
}