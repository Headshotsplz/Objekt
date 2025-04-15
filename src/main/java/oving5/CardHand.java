package oving5;

import java.util.ArrayList;
import java.util.List;

public class CardHand implements CardContainer {

    List<Card> cards = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }
    
    public Card play(int n){
        cards.remove(n);
        return cards.get(n);
    }

    public Card getCard(int n) {
        if (n < 0 || n > cards.size()) {
            throw new IllegalArgumentException("Invalid card " + n);
        }
        return cards.get(n);
    }

    public int getCardCount() {
        return cards.size();
    }

    public CardContainerIterator(CardContainer container){

    }

    
}
