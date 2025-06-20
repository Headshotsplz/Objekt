package oving4.testing;

public class Card {
    private final String suit;
    private final int face;

    
    public Card(String suit, int face) {
        if (suit != "S" && suit != "H" && suit != "D" && suit != "C") {
            throw new IllegalArgumentException("invalid suit");
        }
        if (face < 1 || face > 13) {
            throw new IllegalArgumentException("invalid face");
        }
        this.suit = suit;
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }
    public int getFace() {
        return face;
    }

    @Override
    public String toString() {
        return "Card [suit=" + suit + ", face=" + face + "]";
    }

    




    
}
