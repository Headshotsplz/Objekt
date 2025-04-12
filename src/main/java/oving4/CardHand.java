package oving4;

import java.util.ArrayList;
import java.util.List;

public class CardHand {

    List<Card> CardHand = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }
    
    public Card play(int n){
        CardHand.remove(n);
        return CardHand.get(n);
    }

    public Card getCard(int n) {
        if (n < 0 || n > CardHand.size()) {
            throw new IllegalArgumentException("Invalid card " + n);
        }
        return CardHand.get(n);
    }

    public int getCardCount() {
        return CardHand.size();
    }

    
}
