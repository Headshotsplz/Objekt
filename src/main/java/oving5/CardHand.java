import java.util.ArrayList;
import java.util.List;

import oving3.Card;
import oving5.CardContainer;

public class CardHand implements CardContainer{
    
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }

    public Card play(int n){
        Card card = cards.get(n);
        cards.remove(n);
        return card;
    }
    
    @Override
    public int getCardCount(){
        return cards.size();
    }

    @Override
    public Card getCard(int n){
        return cards.get(n);
    }
}
