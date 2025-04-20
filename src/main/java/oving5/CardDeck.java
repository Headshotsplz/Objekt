package oving5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CardDeck{

    private final String suits = "SHDC";
    private int face;
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

    public boolean hasCard(Predicate<Card> predicate){
        if (predicate == null) {
            throw new IllegalArgumentException("");
        }
        return cards.stream().anyMatch(predicate);
    }
    
    public int getCardCount(Predicate<Card> predicate){
        if (predicate == null) {
            throw new IllegalArgumentException("");
        }
        return (int) cards.stream().filter(predicate).count();

        
        
    }
    public List<Card> getCards(Predicate<Card> predicate){
        if (predicate == null) {
            throw new IllegalArgumentException("");
        }
        return cards.stream().filter(predicate).collect(Collectors.toList());
    }


    public int getCardCount() {
        return cards.size();
    }

    public void deal(CardHand hand, int n){
        for (int i = 0; i < 10; i++) {

            int lastIndex = cards.size() - 1;
            Card card = cards.get(lastIndex);

            cards.remove(lastIndex);
            hand.addCard(card);
        } 
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

}
