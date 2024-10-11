package menus;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * RestaurantMenu is an abstract class that represents a restaurant menu.
 * It defines common attributes such as name, period, and menu items, and provides
 * methods for setting and getting these attributes.
 */
public abstract class RestaurantMenu {

    private String name; // Menu name
    private String period; // Period during which the menu is active

    // Menu items
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;

    /**
     * Gets the name of the menu.
     * 
     * @return the menu name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the menu.
     * 
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the period when the menu is active.
     * 
     * @return the period during which the menu is active.
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the period when the menu is active.
     * 
     * @param period the period to set.
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * Abstract method to populate the menu with menu items.
     */
    public abstract void populateMenu();

    /**
     * Returns a string representation of the restaurant menu.
     * 
     * @return a string describing the menu items.
     */
    @Override
    public String toString() {
        StringBuilder menuDetails = new StringBuilder();

        menuDetails.append("The ").append(getName()).append("\n");
        menuDetails.append("Active: ").append(getPeriod()).append("\n\n");

        menuDetails.append("Entrees:\n");
        menuDetails.append(entree).append("\n\n");

        menuDetails.append("Main Courses:\n");
        menuDetails.append(mainCourse).append("\n\n");

        menuDetails.append("Desserts:\n");
        menuDetails.append(dessert).append("\n\n");

        menuDetails.append("Drinks:\n");
        menuDetails.append(drink).append("\n");

        return menuDetails.toString();
    }
}
