package oving7.savingsaccount;

public class BSU extends SavingsAccount {

    private int balance;
    private double deposit;

    public BSU(double rent, double deposit) {
        super(rent);
        if(deposit > 25000){
            throw new IllegalArgumentException("Innskuddsgrensen er max 25 000 kr");
        }
        this.deposit = deposit;
    }

    public double getTaxDeduction(){
        return this.deposit * 0.8;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }
        this.balance += amount;
    }
    
}
