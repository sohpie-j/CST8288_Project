package menu_factory;
import components.Entree;
import components.MainCourse;
import components.Dessert;
import components.Drink;

import components.WinterEntree;
import components.WinterMainCourse;
import components.WinterDessert;
import components.WinterDrink;

/**
 * WinterRestaurantMenuFactory is a concrete factory that implements the RestaurantMenuFactory
 * interface. It creates Winter-specific menu items such as entrees, main courses, desserts, and drinks.
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {
    
    @Override
    public Drink createDrink() {
        return new WinterDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
         return new WinterMainCourse();
    }

    @Override
    public Entree createEntree() {
        return new WinterEntree();
    }


    @Override    
    public Dessert createDessert() {
        return new WinterDessert();
    }   
    
}
