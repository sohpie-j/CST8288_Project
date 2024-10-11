/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class SpringDessert implements Dessert {
       private final String item1;
    private final String item2;
    private final String item3;
    private final String item4;

    // Constructor to set winter-specific menu items
    public SpringDessert() {
        this.item1 = "Vanilla Crème Brûlée";
        this.item2 = "White Chocolate ";
        this.item3 = "Brownie";
        this.item4 = "Passion Fruit Fig Tart";
    }

    // Optionally, you can add a method to return a string representation of the main course
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3 +"\n" + item4;
    }
    
}

