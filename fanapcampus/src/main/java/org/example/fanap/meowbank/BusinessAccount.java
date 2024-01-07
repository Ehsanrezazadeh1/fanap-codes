package org.example.fanap.meowbank;

public class BusinessAccount extends BankAccount {

    private double creditLimitation;
    private double transactionFeeAmount;

    public BusinessAccount(String accountNumber, String ownerName, double balance, double creditLimitation, double transactionFeeAmount) {
        super(accountNumber, ownerName, balance);
        this.creditLimitation = creditLimitation;
        this.transactionFeeAmount = transactionFeeAmount;
    }

    @Override
    public void withdraw(double amount) {
        double totalWithdrawalAmount = amount + (amount * transactionFeeAmount);
        super.withdraw(totalWithdrawalAmount);
    }


}
