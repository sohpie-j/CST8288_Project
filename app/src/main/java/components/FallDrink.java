package components;

/**
 * FallDrink is a concrete class that implements the Drink interface.
 * It represents the Drink menu items for the Fall season.
 */
public class FallDrink implements Drink {
    
    private final String item1;
    private final String item2;
    private final String item3;
    
    /**
     * Constructor to set fall-specific Drink menu items.
     */
    public FallDrink() {
        this.item1 = "Margarita";
        this.item2 = "Dark Rum";
        this.item3 = "Ornage Juice";
    }

    /**
     * Returns a string representation of the fall Drink items.
     * 
     * @return a string listing the Drink items.
     */
    @Override
    public String toString() {
        return item1 + ", " + item2 + ", " + item3;
    }
    
}
