/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import menu_factory.RestaurantMenuFactory;
//import components.Dessert;
//import components.Drink;
//import components.MainCourse;
//import components.Entree;
/**
 *
 * @author gouraya
 */
public class SummerRestaurantMenu extends RestaurantMenu {
    
      RestaurantMenuFactory theFactory;
    
    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        // Insert code to assign menu items created
        
                // Using the factory to create menu items for Winter Menu
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
