package oving7.savingsaccount;

public interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}
