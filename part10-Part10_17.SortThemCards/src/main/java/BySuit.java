
import java.util.Comparator;
import java.util.HashMap;

public class BySuit implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        HashMap<Suit, Integer> suitList = new HashMap<>();
        suitList.put(Suit.CLUB, 1);
        suitList.put(Suit.DIAMOND, 2);
        suitList.put(Suit.HEART, 3);
        suitList.put(Suit.SPADE, 4);

        int card1Suit = suitList.get(card1.getSuit());
        int card2Suit = suitList.get(card2.getSuit());

        if (card1Suit > card2Suit) {
            return 1;
        }

        if (card1Suit < card2Suit) {
            return -1;
        }

        return 0;
    }

}
