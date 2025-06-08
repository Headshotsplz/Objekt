package oving1;

public class Account {

    private double balance = 0.0;
    private double interestRate = 0.0;


    public void deposit(double amount){
        if (amount < 0) {
            return;
        }
        this.balance += amount;
    }
    public void setInterestRate(double amount){
        this.interestRate += amount;
    }

    public void addInterest(){
        balance += interestRate;
    }
    public double getBalance(){
        return balance;

    }
    public double getInterestRate(){
        return interestRate;

    }
}
