package org.example.fanap.meowbank;

import java.util.Date;

public class Transaction {

    private String transactionId;
    private String transactionType;
    private double amount;
    private Date transactionDate;
    private BankAccount account;

    public Transaction(String transactionId, String transactionType, double amount, Date transactionDate, BankAccount account) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.account = account;
    }

    public void execute(){
        switch (transactionType){
            case "DEPOSIT":
                account.deposit(amount);
            case "WITHDRAW":
                account.withdraw(amount);
            break;

            default:
                System.out.println("Bye");
        }
    }

    public void rollback() {
        switch (transactionType) {
            case "DEPOSIT":
                account.withdraw(amount);
                break;
            case "WITHDRAW":
                account.deposit(amount);
                break;

            default:
                System.out.println("not know about it");
        }

        System.out.println("successfully.");
    }
}
