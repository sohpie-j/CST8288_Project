package components;

/**
 * WinterDessert is a concrete class that implements the Dessert interface.
 * It represents the Dessert menu items for the Winter season.
 */
public class WinterDessert implements Dessert {
    
     private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set Winter-specific Dessert menu items.
     */
    public WinterDessert() {
        this.item1 = "Chocolate Mousse";
        this.item2 = "Caramel Cheesecake";
        this.item3 = "Chocolate Sponge Cake";
    }

    /**
     * Returns a string representation of the Winter Dessert items.
     * 
     * @return a string listing the Dessert items.
     */
    @Override
    public String toString() {
        return item1 + "\n " + item2 + "\n" + item3;
    }
}
