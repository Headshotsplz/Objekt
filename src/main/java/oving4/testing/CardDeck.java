package oving4.testing;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    private List<Card> cards = new ArrayList<>();
    private int face;
    private static final String suits = "SHDC";


    public CardDeck(int n){
        for (char suit : suits.toCharArray()) {
            for (int face = 1; face <= n; face++){
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
    
    public void deal(CardHand hand, int n){
        for (int i = 0; i < n; i++){
            Card card = cards.remove(cards.size() - 1);
            hand.addCard(card);
        }
    }
}
