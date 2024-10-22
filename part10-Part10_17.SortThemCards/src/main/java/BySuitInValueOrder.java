
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        int suitValueOrder = card1.getSuit().ordinal() - card2.getSuit().ordinal();

        if (suitValueOrder == 0) {
            return card1.compareTo(card2);
        }

        return suitValueOrder;
    }

}
