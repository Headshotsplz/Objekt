import java.util.ArrayList;
import java.util.List;

import oving3.Card;
import oving5.CardContainer;

public class CardDeck implements CardContainer {

    private final List<Card> cards = new ArrayList<>();
    private static final String SUITS = "SHDC";

    public CardDeck(int n){
        for (char suit : SUITS.toCharArray()) {
            for (int face = 1; face <= n; face++){
                cards.add(new Card(String.valueOf(suit), face));
            }
        }
    }

    public CardDeck() {
    }



    @Override
    public int getCardCount(){
        return cards.size();
    }
    
    @Override
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
