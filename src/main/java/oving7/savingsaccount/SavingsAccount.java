package oving7.savingsaccount;

public class SavingsAccount implements Account {

    private double balance;
    private double rent = 0.0;

    public SavingsAccount(double rent){
        this.rent = rent;
    }

    public double endYearUpdate(){
        return this.balance *= 1 + rent;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }

        if(balance < amount){
            throw new IllegalStateException("Cannot withdraw larger amount than balance");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("balance cannot be negative");
        }
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
