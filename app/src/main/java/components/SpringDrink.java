package components;

/**
 * SpringDrink is a concrete class that implements the Drink interface.
 * It represents the Drink menu items for the Spring season.
 */
public class SpringDrink implements Drink  {

    private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set Spring-specific Drink menu items.
     */
    public SpringDrink() {
        this.item1 = "CuCumber Smash";
        this.item2 = "Lime Juice";
        this.item3 = "Candy Apple Cider";
    }

    /**
     * Returns a string representation of the Spring Drink items.
     * 
     * @return a string listing the Drink items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3;
    }
}
