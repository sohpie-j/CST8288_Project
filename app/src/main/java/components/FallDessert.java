package components;

/**
 * FallDessert is a concrete class that implements the Dessert interface.
 * It represents the dessert menu items for the Fall season.
 */
public class FallDessert implements Dessert {

    private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set fall-specific dessert menu items.
     */
    public FallDessert() {
        this.item1 = "Carrot Cake";
        this.item2 = "White Chocolate Cheesecake";
        this.item3 = "Apple Pie";
    }

    /**
     * Returns a string representation of the fall dessert items.
     * 
     * @return a string listing the dessert items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3;
    }
}
