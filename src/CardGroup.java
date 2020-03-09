import java.util.ArrayList;
import java.util.Collections;

public class CardGroup {
    ArrayList<Card> cards;

    public CardGroup(){
        cards = new ArrayList<>();
    }

    public void add(Card card){
        cards.add(card);
    }

    public Card remove(Card card){
        cards.remove(card);
        return card;
    }

    public Card remove(int i){
        cards.remove(i);
        return cards.get(i);
    }

    public int size(){
        return cards.size();
    }

    public Card get(int i){
        return cards.get(i);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public int total(ArrayList<Card> cards){
        int count = 0;

        for (Card card : cards){
            count += card.getVal();
        }

        return count;
    }

    public int total(){
        return total(this.cards);
    }
}
