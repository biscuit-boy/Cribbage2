public class Main {
    public static Hand makeHand(String[] cards){
        Hand hand = new Hand();

        for (String card : cards){
            hand.add(new Card(card.charAt(0), card.charAt(1)));
        }

        return hand;
    }

    public static void main(String[] args) {
	    String[] cards1 = {"4S", "4H", "3D", "3S"}; // 4
	    String[] cards2 = {"4S", "4H", "4D", "3S"}; // 8
        String[] cards3 = {"7S", "8H", "8D", "6S"}; // 4

        Hand hand1 = makeHand(cards1);
        Hand hand2 = makeHand(cards2);
        Hand hand3 = makeHand(cards3);

        System.out.println("" + hand1.count());
        System.out.println("" + hand2.count());
        System.out.println("" + hand3.count());
    }
}
