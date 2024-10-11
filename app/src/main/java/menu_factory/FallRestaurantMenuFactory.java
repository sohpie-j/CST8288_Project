package menu_factory;

import components.Entree;
import components.MainCourse;
import components.Dessert;
import components.Drink;
import components.FallEntree;
import components.FallMainCourse;
import components.FallDessert;
import components.FallDrink;

/**
 * FallRestaurantMenuFactory is a concrete factory that implements the RestaurantMenuFactory
 * interface. It creates fall-specific menu items such as entrees, main courses, desserts, and drinks.
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        return new FallDrink();
    }

    @Override
    public MainCourse createMainCourse() {
        return new FallMainCourse();
    }

    @Override
    public Entree createEntree() {
        return new FallEntree();
    }

    @Override
    public Dessert createDessert() {
        return new FallDessert();
    }
}
