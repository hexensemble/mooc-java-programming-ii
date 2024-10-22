
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream()
                .forEach(card -> System.out.println(card));
    }

    public void sort() {
        List<Card> sortedHand = this.hand.stream()
                .sorted()
                .collect(Collectors.toList());
        this.hand = sortedHand;
    }

    public int getSum() {
        int sum = 0;
        for (Card c : this.hand) {
            sum += c.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand comparedHand) {
        if (this.getSum() > comparedHand.getSum()) {
            return 1;
        }

        if (this.getSum() < comparedHand.getSum()) {
            return -1;
        }

        return 0;
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }

}
