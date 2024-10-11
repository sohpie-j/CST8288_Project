package components;

/**
 * The MainCourse interface represents a MainCourse in a restaurant menu.
 * Classes that implement this interface should define their specific MainCourse.
 */
public interface MainCourse {

    /**
     * Returns a string representation of the MainCourse items.
     * 
     * @return a string describing the MainCourse items.
     */
    @Override
    public String toString();  
}
