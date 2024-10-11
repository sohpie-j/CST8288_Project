package menu_building;

import menus.RestaurantMenu;

/**
 * The MenuBuilding class is responsible for building restaurant menus
 * based on the given season. It uses the factory pattern to create menus.
 */
public abstract class MenuBuilding {

    /**
     * Abstract method for creating the menu based on the season.
     * This method must be implemented by subclasses.
     * 
     * @param season the season for which the menu will be created.
     * @return the created restaurant menu.
     */
    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Builds the restaurant menu by calling the factory method to create the menu items.
     * 
     * @param season the season for which the menu will be created.
     * @return the built restaurant menu with all the items populated.
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }
}
