import java.util.ArrayList;
import java.util.Collections;

public class Hand extends CardGroup {
    public Hand(){
        super();
    }

    public int count(){
        int total = 0;

        //total += countDoubles(cards);
        total += countFifteens(getCards());

        Collections.sort(getCards());

        //total += countRuns(getCards());

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

    private int countFifteens(ArrayList <Card> hand, int target){
        if (total(hand) < target){
            return 0;
        }
        else if (total(hand) == target){
            return 2;
        }
        else{
            int count = 0;

            for (int i=0; i < hand.size(); ++i){
                count += countFifteens(hand, target - hand.get(i).getVal());
            }

            return count;
        }
    }

    private int countRuns(ArrayList<Card> hand){
        return 0;
    }
}
