/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class FallDessert implements Dessert {

    private final String item1;
    private final String item2;
    private final String item3;

    // Constructor to set winter-specific menu items
    public FallDessert() {
        this.item1 = "Carrot Cake";
        this.item2 = "White Chocolate Cjeesecale";
        this.item3 = "Apple Pie";
    }

    // Optionally, you can add a method to return a string representation of the main course
    @Override
    public String toString() {
        return item1 + ", " + item2 + ", " + item3;
    }
}
