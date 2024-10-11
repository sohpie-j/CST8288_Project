package components;

/**
 * SpringEntree is a concrete class that implements the Entree interface.
 * It represents the Entree menu items for the Fall season.
 */
public class SpringEntree implements Entree {
    
        private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set fall-specific Entree menu items.
     */
    public SpringEntree() {
        this.item1 = "Lobster Veracruzana";
        this.item2 = "Organic Ocean Halibut";
        this.item3 = "Mushroom Soup";
    }

    /**
     * Returns a string representation of the fall Entree items.
     * 
     * @return a string listing the Entree items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3;
    }
}
