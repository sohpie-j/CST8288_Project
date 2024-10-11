package components;

/**
 * SpringDessert is a concrete class that implements the Dessert interface.
 * It represents the Dessert menu items for the Spring season.
 */
public class SpringDessert implements Dessert {
       private final String item1;
    private final String item2;
    private final String item3;
    private final String item4;

    /**
     * Constructor to set Spring-specific Dessert menu items.
     */
    public SpringDessert() {
        this.item1 = "Vanilla Crème Brûlée";
        this.item2 = "White Chocolate ";
        this.item3 = "Brownie";
        this.item4 = "Passion Fruit Fig Tart";
    }

    /**
     * Returns a string representation of the Spring Dessert items.
     * 
     * @return a string listing the Dessert items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3 +"\n" + item4;
    }
    
}

