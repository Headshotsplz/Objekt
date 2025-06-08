package kladd;

public class BankAccount {
    private String owner;
    private double balance;
    private boolean isLocked;

    public BankAccount(){
        this.owner = owner;
        this.balance = 0;
        this.isLocked = false;
    }

    public void validateBalance(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("");
        }
        if (isLocked == false){
            throw new IllegalArgumentException("");
        }
    }
    
    public void deposit(double amount){
        validateBalance(amount);
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance) {
            throw new IllegalArgumentException("");
        }
        if (isLocked == false) {
            throw new IllegalArgumentException("");
        }
        balance -= amount;
    }

    public void lock(){

        this.isLocked = true;
    }

    public void unlock(){
        this.isLocked = false;
    }

    public double getBalance() {
        if (isLocked = false) {
            throw new IllegalStateException("");
        }
        return balance;
    }
    

    
}
