package patterns.miscellaneous.InterfaceSegregationPrinciple;

import patterns.miscellaneous.BankAccount;

public class LoanAccount implements BankAccount {

    double balance = 0;
    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
/*
        //empty method – cannot withdraw from loan accounts
        Can't implement this because we can not withdraw from a loan account so unnecessarily we have to
        implement this method else we'll need to define this class as abstract class.
*/
    }

    @Override
    public void calculateInterest() {

    }
}
