/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class SpringMainCourse implements MainCourse {
    
    private final String item1;
    private final String item2;
    private final String item3;
    private final String item4;

    // Constructor to set winter-specific menu items
    public SpringMainCourse() {
        this.item1 = "Sunny Rise Burger";
        this.item2 = "California Spring Salad";
        this.item3 = "Crispy Chicken";
        this.item4 = "Sandwich";
    }

    // Optionally, you can add a method to return a string representation of the main course
    @Override
    public String toString() {
        return item1 + "\n" + item2 + "\n" + item3 + "\n" + item4;
    }
    
}
