package menu_factory;
import components.Entree;
import components.MainCourse;
import components.Dessert;
import components.Drink;

import components.SummerEntree;
import components.SummerMainCourse;
import components.SummerDessert;
import components.SummerDrink;
/**
 * SummerRestaurantMenuFactory is a concrete factory that implements the RestaurantMenuFactory
 * interface. It creates Summer-specific menu items such as entrees, main courses, desserts, and drinks.
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {
   
    @Override
    public Drink createDrink() {
        return new SummerDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
         return new SummerMainCourse();
    }

    @Override    
    public Entree createEntree() {
         return new SummerEntree();
    }

    @Override    
    public Dessert createDessert() {
        return new SummerDessert();
    }
    
}
