package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * SummerRestaurantMenu is a subclass of RestaurantMenu and represents a restaurant menu
 * for the Sumer season. It populates the menu with Summer-specific items.
 */
public class SummerRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;

    /**
     * Constructor that accepts a factory for creating Summer-specific menu items.
     * 
     * @param factory the factory used to create the menu items.
     */    
    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    /**
     * Populates the menu with Summer-specific menu items (entree, main course, dessert, drink).
     */
    
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());

        entree = theFactory.createEntree();
        mainCourse = theFactory.createMainCourse();
        dessert = theFactory.createDessert();
        drink = theFactory.createDrink();
        
    }
    
}
