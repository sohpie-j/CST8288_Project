package components;

/**
 * SummerDessert is a concrete class that implements the Dessert interface.
 * It represents the Dessert menu items for the Fall season.
 */
public class SummerDessert implements Dessert {
       private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set fall-specific Dessert menu items.
     */
    public SummerDessert() {
        this.item1 = "Lime Pie";
        this.item2 = "Ultimate Cookie";
        this.item3 = "Churro Ice Cream ";

    }

    /**
     * Returns a string representation of the fall Dessert items.
     * 
     * @return a string listing the Dessert items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3;
    } 
    
}
