
public class Main {

    public static void main(String[] args) {
        Hold hold = new Hold(10);

        Suitcase suitcase1 = new Suitcase(5);
        Item shoes = new Item("Shoes", 3);
        Item tshirt = new Item("Tshirt", 2);
        suitcase1.addItem(shoes);
        suitcase1.addItem(tshirt);

        Suitcase suitcase2 = new Suitcase(5);
        Item laptop = new Item("Laptop", 5);
        suitcase2.addItem(laptop);

        hold.addSuitcase(suitcase1);
        hold.addSuitcase(suitcase2);

        hold.printItems();
    }

}
