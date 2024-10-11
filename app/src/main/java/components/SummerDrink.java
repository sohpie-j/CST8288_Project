package components;


/**
 * SummerDrink is a concrete class that implements the Drink interface.
 * It represents the Drink menu items for the Summer season.
 */
public class SummerDrink implements Drink {

     private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set Summer-specific Drink menu items.
     */
    public SummerDrink() {
        this.item1 = "Lemonade";
        this.item2 = "Aangria";
        this.item3 = "Rum Punch";
    }

    /**
     * Returns a string representation of the Summer Drink items.
     * 
     * @return a string listing the Drink items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3;
    }
}
