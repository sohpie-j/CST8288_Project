/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class FallDrink implements Drink {
       private final String item1;
    private final String item2;
    private final String item3;

    // Constructor to set winter-specific menu items
    public FallDrink() {
        this.item1 = "Margarita";
        this.item2 = "Dark Rum";
        this.item3 = "Ornage Juice";
    }

    // Optionally, you can add a method to return a string representation of the main course
    @Override
    public String toString() {
        return item1 + ", " + item2 + ", " + item3;
    }
    
}
