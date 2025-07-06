package oving7.card;

import java.util.ArrayList;
import java.util.List;
import oving3.Card;

public class CardHand extends CardContainerImpl implements CardContainer{

	private final List<Card> cards = new ArrayList<>();

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public int getCardCount() {
		return this.cards.size();
	}

        @Override
	public Card getCard(int i) {
		if (i < 0 || i >= this.getCardCount()) {
			throw new IllegalArgumentException(
					"Index " + i + " out of bounds for deck of size " + this.getCardCount());
		}

		return this.cards.get(i);
	}

	public Card play(int i) {
		return this.cards.remove(i);
	}

	@Override
	public String toString() {
		return String.format("[CardHand cards=%s]", this.cards);
	}
}