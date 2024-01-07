package org.example.fanap.meowbank;

public interface InvestmentCapable {
    void doInvestment(double amount, String investmentType);
    void manageInvestment(double amount);

    default double calculateReturnOnInvestment(double investmentAmount, double returnRate) {
        return investmentAmount * returnRate;
    }
}
