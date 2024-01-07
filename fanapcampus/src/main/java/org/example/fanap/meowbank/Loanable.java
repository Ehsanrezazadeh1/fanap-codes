package org.example.fanap.meowbank;

public interface Loanable {

    void requestLoan(double amount);

    void repayLoan(double amount);

    default double calculateInterest(double amount, double interestRate) {
        return amount * interestRate;
    }
}
