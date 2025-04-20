package oving5;

import java.util.Iterator;

public class CardContainerIterator implements Iterator<Card> {

    private CardContainer cardcontainer;

    private int pos = 0;

    public CardContainerIterator(CardContainer cardcontainer){
        this.cardcontainer = cardcontainer;

    }

    @Override
    public boolean hasNext() {
        if (pos < cardcontainer.getCardCount()) {
            return true;
        }
        return false;
        }

    @Override
    public Card next() {
        //Vi henter metode getcard fra cardcontainer klasse og henter ett og ett kort, 
        //økter pos med 1 for å hente alle indeksene.
        return cardcontainer.getCard(pos++);
    }
}
