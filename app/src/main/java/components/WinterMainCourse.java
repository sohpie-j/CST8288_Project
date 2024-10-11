package components;

/**
 * WinterMainCourse is a concrete class that implements the MainCourse interface.
 * It represents the MainCourse menu items for the Fall season.
 */
public class WinterMainCourse implements MainCourse {
    
    private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set fall-specific MainCourse menu items.
     */
    public WinterMainCourse() {
        this.item1 = "Roast Beef";
        this.item2 = "Pork Tenderloin";
        this.item3 = "Vegetarian Shepherd's Pie";
    }

    /**
     * Returns a string representation of the MainCourse entree items.
     * 
     * @return a string listing the MainCourse items.
     */
    @Override
    public String toString() {
        return item1 + "\n " + item2 + "\n " + item3;
    }
}
