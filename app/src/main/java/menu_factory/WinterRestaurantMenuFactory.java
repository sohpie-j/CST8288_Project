/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 *
 * @author gouraya
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
