package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * SpringRestaurantMenu is a subclass of RestaurantMenu and represents a restaurant menu
 * for the Spring season. It populates the menu with Spring-specific items.
 */
public class SpringRestaurantMenu extends RestaurantMenu {

    RestaurantMenuFactory theFactory;
    
    /**
     * Constructor that accepts a factory for creating Spring-specific menu items.
     * 
     * @param factory the factory used to create the menu items.
     */    
    public SpringRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    /**
     * Populates the menu with Spring-specific menu items (entree, main course, dessert, drink).
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
