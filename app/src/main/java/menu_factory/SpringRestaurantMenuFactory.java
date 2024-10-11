package menu_factory;
import components.Entree;
import components.MainCourse;
import components.Dessert;
import components.Drink;

import components.SpringEntree;
import components.SpringMainCourse;
import components.SpringDessert;
import components.SpringDrink;

/**
 * SpringRestaurantMenuFactory is a concrete factory that implements the RestaurantMenuFactory
 * interface. It creates Spring-specific menu items such as entrees, main courses, desserts, and drinks.
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        return new SpringDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
         return new SpringMainCourse();
    }

    @Override    
    public Entree createEntree() {
         return new SpringEntree();
    }

    @Override    
    public Dessert createDessert() {
        return new SpringDessert();
    } 
}
