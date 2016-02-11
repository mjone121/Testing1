package P3;

public class Card_shuffle {
    public static void main(String[] args){

        int[] deck = new int[51];
        String[] players = {"North", "East", "South", "West"};
        String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King",};


        for (int o = 0; o < deck.length; o++) {
            deck[o] = o;
        }


        for(int s = 0; s < deck.length; s++){
            int index = (int)(Math.random() + deck.length);
            int temp = deck[s];
            deck[s] = deck[index];
            deck[index] = temp;
        }
        String Suit;
        String Rank;

        for(String reveal: players) {
            for (int r = 0; r < 13; r++) {
                Suit = suits[deck[r] / 13];
                Rank = ranks[deck[r] % 13];
                System.out.println(reveal + "deals:\n" + Rank + " of " + Suit);
            }
        }
    }
}
