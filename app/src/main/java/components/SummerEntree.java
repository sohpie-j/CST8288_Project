package components;

/**
 * SummerEntree is a concrete class that implements the Entree interface.
 * It represents the Entree menu items for the Summer season.
 */
public class SummerEntree implements Entree {
    
      private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set Summer-specific Entree menu items.
     */
    public SummerEntree() {
        this.item1 = "Avaocado scramble";
        this.item2 = "Little Gem Salad";
        this.item3 = "Miso Cauliflower Soup";
    }

    /**
     * Returns a string representation of the Summer entree items.
     * 
     * @return a string listing the entree items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3;
    }  
}
