package org.example.fanap.meowbank;

import org.example.fanap.meowbank.BankAccount;

public class PremiumAccount extends BankAccount {

    private double investments;

    public PremiumAccount(String accountNumber, String ownerName, double balance, double investments) {
        super(accountNumber, ownerName, balance);
        this.investments = investments;
    }

    public double calculateInterest() {
        return getBalance() * investments;
    }
}
