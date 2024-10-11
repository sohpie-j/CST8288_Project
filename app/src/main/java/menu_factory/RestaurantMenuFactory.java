package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * RestaurantMenuFactory is an interface for creating menu items (Entree, MainCourse,
 * Dessert, Drink). This is part of the abstract factory pattern for creating seasonal menus.
 */
public interface RestaurantMenuFactory {
    
    /**
     * Creates a drink for the menu.
     * 
     * @return a drink item for the menu.
     */
    public Drink createDrink();

    /**
     * Creates a main course for the menu.
     * 
     * @return a main course item for the menu.
     */
    public MainCourse createMainCourse();

    /**
     * Creates an entree for the menu.
     * 
     * @return an entree item for the menu.
     */
    public Entree createEntree();

    /**
     * Creates a dessert for the menu.
     * 
     * @return a dessert item for the menu.
     */
    public Dessert createDessert();
}
