package components;

/**
 * WinterDrink is a concrete class that implements the Drink interface.
 * It represents the Drink menu items for the Winter season.
 */
public class WinterDrink implements Drink  {
    
    private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set Winter-specific Drink menu items.
     */
    public WinterDrink() {
        this.item1 = "Mojito";
        this.item2 = "Alcohol Free Wine";
        this.item3 = "Tequila";
    }

    /**
     * Returns a string representation of the Winter Drink items.
     * 
     * @return a string listing the Drink items.
     */
    @Override
    public String toString() {
        return item1 + "\n " + item2 + "\n" + item3;
    }
    
}
