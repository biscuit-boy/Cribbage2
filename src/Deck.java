import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck extends CardGroup{
    public Deck() {
        super();

        for (char suit : Card.SUITS){
            for (char face : Card.FACES){
                getCards().add(new Card(suit, face));
            }
        }

        shuffle();
    }

    public Card draw(){
        return remove(0);
    }
}
