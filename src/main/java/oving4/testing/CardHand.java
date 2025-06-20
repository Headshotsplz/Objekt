package oving4.testing;

import java.util.ArrayList;
import java.util.List;

public class CardHand {
    
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }

    public Card play(int n){
        Card card = cards.get(n);
        cards.remove(n);
        return card;
    }
    
    public int getCardCount(){
        return cards.size();
    }

    public Card getCard(int n){
        return cards.get(n);
    }
}
