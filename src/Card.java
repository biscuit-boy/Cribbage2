public class Card implements Comparable{
    private char suit;
    private char face;
    private int val;

    public static char[] SUITS = {'C', 'D', 'S', 'H'};
    public static char[] FACES = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'Q', 'K'};

    public static char[] SUIT_CHARS = {'♣', '♢', '♠', '♡'};

    public Card(char face, char suit) {
        this.suit = suit;
        this.face = face;

        if (getIndex(FACES, face) < 9){
            this.val = getIndex(FACES, face) + 1;
        }
        else{
            this.val = 10;
        }
    }

    public static int getIndex(char[] arr, char c){
        for (int i=0; i < arr.length; ++i){
            if (arr[i] == c){
                return i;
            }
        }

        return -1;
    }

    public char getSuit() {
        return suit;
    }

    public char getFace() {
        return face;
    }

    public int getVal() {
        return val;
    }

    public int compVal(){
        return 4*getIndex(FACES, face) + getIndex(SUITS, suit);
    }

    public int compareTo(Object other){
        return  this.compVal() - ((Card) other).compVal();
    }

    public String toString(){
        return "" + face + SUIT_CHARS[getIndex(SUITS, suit)];
    }
}
