package oving3;

public class Nim {

    private int targetPile;

    public Nim(int pileSize){
        if (pileSize < 0) {
            throw new IllegalArgumentException("pile size cannot be negative");   
        }
        this.targetPile = pileSize;
    }

    public void removePieces(){
        if (number <= 0 || number > targetPile) {
            throw new IllegalArgumentException("Invalid number of pieces to remove");
        }
        if (isGameOver()) {
            throw new IllegalStateException("game is over");
        }
        this.targetPile -= number;
    }

    public boolean isValidMove(int number, int targetPile){
        if (isGameOver() == true) {
            return false;
        }
        if (targetPile == 0 && number == 0) {
            return false;
        }
        return true;
    }

    public boolean isGameOver(){
        if (targetPile == 0) {
            return true;
        }
        return false;
    }

    public int getPile(int targetPile){
        return targetPile;
    }

    @Override
    public String toString() {
        return "Nim [targetPile]"
                + ", isGameOver()=" + isGameOver() + "]";
    }

}