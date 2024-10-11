package components;

/**
 * FallEntree is a concrete class that implements the Entree interface.
 * It represents the Entree menu items for the Fall season.
 */
public class FallEntree implements Entree {
       private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set fall-specific Entree menu items.
     */
    public FallEntree() {
        this.item1 = "Spinach and Artichoke Dip";
        this.item2 = "Seasame Soy Tuna Tartare";
        this.item3 = "Tuscan Bruschetta";
    }

    /**
     * Returns a string representation of the fall entree items.
     * 
     * @return a string listing the entree items.
     */
    @Override
    public String toString() {
        return item1 + ", " + item2 + ", " + item3 ;
    }
    
}
