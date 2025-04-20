package kladd;

public class LoyaltyCard {
    
    private String owner;
    private int points;
    private boolean isActive = false;

    public void registerPurchase(int amount){
        if (this.isActive == false || amount < 0) {
            throw new IllegalArgumentException("");
        }
        points += amount / 10; 
    }

    public int getPoints(){
        return points;
    }

    public boolean isActive(){
        return isActive;
    }

    public void deactivate(){
        this.isActive = false;
    }
    public void activate(){
        if (points > 0) {
            isActive = true;
        }
    }
}
