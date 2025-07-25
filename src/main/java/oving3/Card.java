package oving3;

/**
 * The {@code Card} class is a so-called value-based class, which is coded in such a way that its
 * objects cannot be modified after they are created. A {@code Card} object has a suit and a face.
 */
public class Card {

    private char suit;
    private int face;

    /**
     * The constructor of the {@code Card} class initializes the suit and face of the card with the
     * first and second arguments, respectively.
     * 
     * @param suit the suit of the card, one of {@code 'S'} (spades), {@code 'H'} (hearts),
     *        {@code 'D'} (diamonds), or {@code 'C'} (clubs)
     * @param face the face of the card, an integer between {@code 1} (ace) and {@code 13} (king)
     *        (both inclusive)
     * @throws IllegalArgumentException if the suit or face is illegal
     * 
     * @see {@link CardTest#testConstructor}
     */
    public Card(String suit, int face) {
        if (string != 'S' && suit != 'H' && string != 'D' && suit != 'C') {
            throw new IllegalArgumentException("illegal suit");
        }
        if (face <= 0 || face > 13) {
            throw new IllegalArgumentException("illegal face");
        }
        this.face = face;
        this.suit = string;
    }

    /**
     * @return the suit of the card
     */
    public char getSuit() {
        return this.suit;
    }

    /**
     * @return the face of the card
     */
    public int getFace() {
        return this.face;
    }

    /**
     * @return the value of the card of the form {@code <suit><face>}. For example, the ace of
     *         spades should return {@code "S1"}
     * 
     * @see {@link CardTest#testToString}
     */
    @Override
    public String toString() {
        // TODO: implement this method
        return "" + suit + face;
    }

    public static void main(String[] args) {
        Card card = new Card('S', 1);
        System.out.println(card);
    }
}