
package oving5;

public class Card implements Comparable<Card> {

    private final char suit;
    private final int face;
    private static final String SUITS = "SHDC";

    
    public Card(char suit, int face) {
        if (suit != 'S' && suit != 'H' && suit != 'D' && suit != 'C') {
            throw new IllegalArgumentException("invalid suit");
        }
        if (face < 1 || face > 13) {
            throw new IllegalArgumentException("invalid face");
        }
        this.suit = suit;
        this.face = face;
    }

    public char getSuit() {
        return this.suit;
    }
    public int getFace() {
        return this.face;
    }

    @Override
    public int compareTo(Card otherCard) {
        String suitOrder = "CDHS";

        
}
