package oving3;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private Card card;
    private static final char[] suits = {'S', 'H', 'D', 'C'};
    private int face;
    private final List<Card> cards = new ArrayList<>();
    
    public CardDeck(int n){
        if (n < 0) {
            throw new IllegalArgumentException("");
        }

        for (char suit : suits) {
            for (int face = 1; face <= n; face++) {
                cards.add(new Card(suit, face));
            }
        }
    
    }

    public int getCardCount(){
        return cards.size();
    }

    public Card getCard(int n){
        return cards.get(n);
    }

    public void shufflePerfectly(){
        int halfSize = cards.size() / 2;
        List<Card> halfDeck1 = new ArrayList<>(cards.subList(0, halfSize));
        List<Card> halfDeck2 = new ArrayList<>(cards.subList(halfSize, cards.size()));
        List<Card> shuffledDeck = new ArrayList<>();

        for (int i = 0; i < halfDeck1.size(); i++) {
            shuffledDeck.add(halfDeck1.get(i));
            if (i < halfDeck2.size()) {
                shuffledDeck.add(halfDeck2.get(i));
            }
        }
    }
}
