package oving7.card;

import java.util.ArrayList;
import java.util.List;

import oving3.Card;
import oving5.CardContainer;

public class CardContainerImpl implements CardContainer {

    List<Card> cards = new ArrayList<>();

    @Override
    public int getCardCount() {
        return this.cards.size();
    }

    @Override
    public Card getCard(int n) {
        if (n < 0 || n >= this.getCardCount()) {
            throw new IllegalArgumentException(
                    "Index " + n + " out of bounds for deck of size " + this.getCardCount());
        }

        return this.cards.get(n);
    }
}
