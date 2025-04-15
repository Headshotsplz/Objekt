package oving5;

import java.util.Iterator;

public class CardContainerIterator implements Iterator<Card> {

    private CardContainer container;

    private int pos = 0;

    public CardContainerIterator(){

    }

    @Override
    public boolean hasNext() {
        return pos < this.container.getCardCount();
    }

    @Override
    public Card next() {

        Card card = this.container.getCard(this.pos);
        this.pos++;
        return card;
    }
    
}
