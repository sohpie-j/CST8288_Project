/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class WinterDrink implements Drink  {
    
    private final String item1;
    private final String item2;
    private final String item3;

    // Constructor to set winter-specific menu items
    public WinterDrink() {
        this.item1 = "Mojito";
        this.item2 = "Alcohol Free Wine";
        this.item3 = "Tequila";
    }

    // Optionally, you can add a method to return a string representation of the main course
    @Override
    public String toString() {
        return item1 + "\n " + item2 + "\n" + item3;
    }
    
}
