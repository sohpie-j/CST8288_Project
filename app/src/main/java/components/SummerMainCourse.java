package components;

/**
 * SummerMainCourse is a concrete class that implements the MainCourse interface.
 * It represents the MainCourse menu items for the Summer season.
 */
public class SummerMainCourse implements MainCourse {

    private final String item1;
    private final String item2;
    private final String item3;

     /**
     * Constructor to set Summer-specific MainCourse menu items.
     */
    public SummerMainCourse() {
        this.item1 = "Beef Tartare";
        this.item2 = "Spiced Cauliflower";
        this.item3 = "Chinook Salmon";
    }

    /**
     * Returns a string representation of the Summer MainCourse items.
     * 
     * @return a string listing the MainCourse items.
     */
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3;
    }
}
