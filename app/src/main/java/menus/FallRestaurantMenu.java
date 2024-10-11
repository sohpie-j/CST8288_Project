/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import menu_factory.RestaurantMenuFactory;

/**
 *
 * @author gouraya
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;
    
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        entree = theFactory.createEntree();
        mainCourse = theFactory.createMainCourse();
        dessert = theFactory.createDessert();
        drink = theFactory.createDrink();
        
        // Display the created menu items
//        System.out.println("Entree: " + entree);
//        System.out.println("Main Course: " + mainCourse);
//        System.out.println("Dessert: " + dessert);
//        System.out.println("Drink: " + drink);
    }
}
