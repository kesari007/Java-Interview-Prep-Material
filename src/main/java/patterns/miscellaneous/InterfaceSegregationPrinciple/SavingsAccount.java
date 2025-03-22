package patterns.miscellaneous.InterfaceSegregationPrinciple;

import patterns.miscellaneous.BankAccount;

public class SavingsAccount implements BankAccount {

    /*
    * Here Savings account can implement all the 3 methods and it sounds fine.
    * */
    double balance = 0;

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        balance-=amount;
    }

    @Override
    public void calculateInterest() {

    }
}
