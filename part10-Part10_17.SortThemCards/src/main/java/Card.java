
import java.util.HashMap;
import java.util.List;

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card comparedCard) {
        if (this.value > comparedCard.getValue()) {
            return 1;
        }

        if (this.value < comparedCard.getValue()) {
            return -1;
        }

        HashMap<Suit, Integer> suitList = new HashMap<>();
        suitList.put(Suit.CLUB, 1);
        suitList.put(Suit.DIAMOND, 2);
        suitList.put(Suit.HEART, 3);
        suitList.put(Suit.SPADE, 4);

        int thisSuit = suitList.get(this.getSuit());
        int comparedCardSuit = suitList.get(comparedCard.getSuit());

        if (thisSuit > comparedCardSuit) {
            return 1;
        }

        if (thisSuit < comparedCardSuit) {
            return -1;
        }

        return 0;
    }
}
