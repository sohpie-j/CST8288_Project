/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus_main;
import menu_building.ConcreteMenuBuilding;
import menu_building.MenuBuilding;
import menus.*;

/**
 *
 * @author gouraya
 */
public class MenuFactoryTest {

public static void main(String[] args) {
        
        MenuBuilding theBuilding = new ConcreteMenuBuilding();
        
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        System.out.println(theFallMenu);
        
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);
                
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu );
         
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
        
    }    
}
