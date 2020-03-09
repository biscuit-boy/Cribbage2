import java.util.ArrayList;
import java.util.Collections;

public class Hand extends CardGroup {
    public Hand(){
        super();
    }

    public int count(){
        int total = 0;

        //total += countDoubles(cards);
        total += countFifteens(cards);

        Collections.sort(cards);

        //total += countRuns(cards);

        return total;
    }

    private int countDoubles(ArrayList<Card> hand){
        if (hand.size() < 2){
            return 0;
        }
        else if (hand.size() == 2){
            if (hand.get(0).getFace() == hand.get(1).getFace())
                return 1; // only one because double counting
        }
        else{
            int count = 0;

            for (int i=0; i < hand.size(); ++i){
                Card temp = hand.remove(i);
                count += countDoubles(hand);
                hand.add(i, temp);
            }

            return count;
        }

        return 0;
    }

    private int countFifteens(ArrayList <Card> hand){
        if (total(hand) < 15){
            return 0;
        }
        else if (total(hand) == 15){
            return 2;
        }
        else{
            int count = 0;

            for (int i=0; i < hand.size(); ++i){
                Card temp = hand.remove(i);
                count += countFifteens(hand);
                hand.add(i, temp);
            }

            return count;
        }
    }

    private int countRuns(ArrayList<Card> hand){
        return 0;
    }
}
