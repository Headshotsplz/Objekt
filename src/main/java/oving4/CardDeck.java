package oving4;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    private int face;
    private final String suits = "SHDC";
    private List<Card> cards = new ArrayList<>();

    public CardDeck(int n){
        if (n < 0 || n > 13) {
            throw new IllegalArgumentException("Invalid card n =  " + n);
        }

        for(char suit : suits.toCharArray()){
            for (int face = 1; face <= n; face++) {
                cards.add(new Card(suit, face));
            }
        }
    }

    public int getCardCount() {
        return cards.size();
    }

    public Card getCard(int n) {
        if (n < 0 || n > cards.size()) {
            throw new IllegalArgumentException("Invalid card " + n);
        }
        return cards.get(n);
    }

    public void shufflePerfectly() {

        //Lager en ny liste med nye dekker som er skuffla.
        List<Card> shuffled = new ArrayList<>();

        //Lager variabel der vi deler antall kort i 2.
        int mid = cards.size() / 2;

        //Lager 2 nye lister som er første og andre halvdel av cards.lista
        List<Card> firstHalf = cards.subList(0, mid);
        List<Card> secondHalf = cards.subList(mid, cards.size());

        //Iterer gjennom alle kortene i første halvdel.
        for (int i = 0; i < mid; i++) {
            shuffled.add(firstHalf.get(i));
            shuffled.add(secondHalf.get(i));
        }

        cards = shuffled;
    }

    public static void main(String[] args) {
        CardDeck deck1 = new CardDeck(4);

        System.out.println(deck1.getCardCount());

        deck1.shufflePerfectly();
        System.out.println(deck1.getCard(5));
    }
}
