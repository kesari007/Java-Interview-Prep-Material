package patterns.miscellaneous;

public interface BankAccount {
    /*
     * ISP states that your clients shouldnt be forced to implement the methods
     * that you define in the interface if they dont need it. Here we have 3 methods.
     * */
    public void deposit(double amount);
    public void withdraw(double amount);
    public void calculateInterest();
}
