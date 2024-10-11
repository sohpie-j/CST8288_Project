package components;

/**
 * WinterEntree is a concrete class that implements the Entree interface.
 * It represents the Entree menu items for the Winter season.
 */
public class WinterEntree implements Entree {
    
     private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set Winter-specific Entree menu items.
     */
    public WinterEntree() {
        this.item1 = "Sesame Soy Tartare";
        this.item2 = "Boston Clam Chowder";
        this.item3 = "Thai Soup";
    }

     /**
     * Returns a string representation of the fall Entree items.
     * 
     * @return a string listing the entree items.
     */
    @Override
    public String toString() {
        return item1 + "\n " + item2 + "\n " + item3;
    }
    
}


