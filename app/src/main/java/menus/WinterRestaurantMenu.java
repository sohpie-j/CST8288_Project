package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * WinterRestaurantMenu is a subclass of RestaurantMenu and represents a restaurant menu
 * for the fall season. It populates the menu with Winter-specific items.
 */
public class WinterRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;

    /**
     * Constructor that accepts a factory for creating Winter-specific menu items.
     * 
     * @param factory the factory used to create the menu items.
     */
    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    /**
     * Populates the menu with Winter-specific menu items (entree, main course, dessert, drink).
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
