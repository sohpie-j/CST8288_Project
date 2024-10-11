package menus_main;

import menu_building.ConcreteMenuBuilding;
import menu_building.MenuBuilding;
import menus.RestaurantMenu;

/**
 * MenuFactoryTest is the main class to test the creation of menus for different seasons.
 */
public class MenuFactoryTest {

    /**
     * The main method where the program starts.
     * It creates menus for Fall, Winter, Spring, and Summer seasons and prints them.
     * 
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {

        MenuBuilding theBuilding = new ConcreteMenuBuilding();

        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall");
        System.out.println(theFallMenu);

        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);

        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu);

        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
    }
}
