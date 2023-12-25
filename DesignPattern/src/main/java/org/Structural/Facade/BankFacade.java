package org.Structural.Facade;

class BankFacade {
    private Account account1;
    private Account account2;
    private Transaction transaction;

    public BankFacade() {
        account1 = new Account(1001, 1000); // Initialize accounts with balances
        account2 = new Account(1002, 2000);
        transaction = new Transaction();
    }

    public void transferMoney(int amount, int fromAccount, int toAccount) {
        Account from = getAccount(fromAccount);
        Account to = getAccount(toAccount);

        if (from != null && to != null) {
            boolean success = transaction.transfer(from, to, amount);
            if (success) {
                System.out.println("Money transferred successfully.");
            }
        } else {
            System.out.println("Invalid account numbers.");
        }
    }

    public int getAccountBalance(int accountNumber) {
        Account account = getAccount(accountNumber);
        return (account != null) ? account.getBalance() : -1;
    }

    private Account getAccount(int accountNumber) {
        if (account1.getAccountNumber() == accountNumber) {
            return account1;
        } else if (account2.getAccountNumber() == accountNumber) {
            return account2;
        } else {
            return null; // Account not found
        }
    }
}
