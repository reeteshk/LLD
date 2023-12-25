package org.Structural.Facade;

public class Client {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();

        System.out.println("Account 1 balance: $" + bank.getAccountBalance(1001));
        System.out.println("Account 2 balance: $" + bank.getAccountBalance(1002));

        bank.transferMoney(500, 1001, 1002); // Successful transfer
        bank.transferMoney(800, 1001, 1002); // Insufficient balance in Account 1001

        System.out.println("Account 1 balance: $" + bank.getAccountBalance(1001));
        System.out.println("Account 2 balance: $" + bank.getAccountBalance(1002));
    }
}
