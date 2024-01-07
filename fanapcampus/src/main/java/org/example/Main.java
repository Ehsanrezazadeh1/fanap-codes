package org.example;

import org.example.fanap.meowbank.BankAccount;
import org.example.fanap.meowbank.BasicAccount;
import org.example.fanap.meowbank.BusinessAccount;
import org.example.fanap.meowbank.PremiumAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount basicAccount = new BasicAccount("A", "Ehsan", 200);
        BankAccount premiumAccount = new PremiumAccount("B", "Reza", 500, 0.05);
        BankAccount businessAccount = new BusinessAccount("C", "Mina", 1000, 5000,500);


        basicAccount.deposit(500);
        premiumAccount.withdraw(1000);
        businessAccount.withdraw(2000);




    }
}
