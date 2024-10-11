package components;

/**
 * SpringMainCourse is a concrete class that implements the MainCourse interface.
 * It represents the MainCourse menu items for the Fall season.
 */

public class SpringMainCourse implements MainCourse {
    
    private final String item1;
    private final String item2;
    private final String item3;
    private final String item4;

    /**
     * Constructor to set fall-specific MainCourse menu items.
     */
    public SpringMainCourse() {
        this.item1 = "Sunny Rise Burger";
        this.item2 = "California Spring Salad";
        this.item3 = "Crispy Chicken";
        this.item4 = "Sandwich";
    }

    /**
     * Returns a string representation of the fall MainCourse items.
     * 
     * @return a string listing the MainCourse items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3 + "\n" + item4;
    }
    
}
