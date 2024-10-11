package components;

/**
 * FallMainCourse is a concrete class that implements the MainCourse interface.
 * It represents the MainCourse menu items for the Fall season.
 */
public class FallMainCourse implements MainCourse{
    
          private final String item1;
    private final String item2;
    private final String item3;

    /**
     * Constructor to set fall-specific MainCourse menu items.
     */
    public FallMainCourse() {
        this.item1 = "Salmon Avocado Toast";
        this.item2 = "Pesto Chicken Penne Asiago";
        this.item3 = "Portobello Mushroom Chicken";
    }

    /**
     * Returns a string representation of the fall MainCourse items.
     * 
     * @return a string listing the MainCourse items.
     */
    @Override
    public String toString() {
        return item1 + ", " + item2 + ", " + item3;
    }
}
