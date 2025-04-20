package kladd;

public class BankAccount {
    
    private String owner;
    private double balance;

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Mia", 1000);
        BankAccount b = new BankAccount("Mia", 1000);

        System.out.println(a.getBalance());
        System.out.println(b.getBalance());

        a.withdraw(200);
        System.out.println(a.getBalance());
        
        b.deposit(500);
        System.out.println(b.getBalance());

    }

    

    public BankAccount(String owner, double balance) {
        if (owner == null) {
            throw new IllegalArgumentException("");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }



    public void deposit(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("");
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("");
        }
        balance -= amount;
    }

    public void transferTo(BankAccount other, double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("");
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException("");
        }
        this.withdraw(amount);
        other.deposit(amount);
    }
}
