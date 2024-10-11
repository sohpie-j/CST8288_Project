/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 *
 * @author gouraya
 */
public abstract class RestaurantMenu {
    
    private String name; // Menu name
    private String period; // Period during which the menu is active
    
    // Newly defined objects that represent the menu items.
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPeriod() {
        return period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }
    
    public abstract void populateMenu();
    
    // Returns the menu contents
    @Override
    public String toString() {
        StringBuilder menuDetails = new StringBuilder();
        
        menuDetails.append("The ").append(getName()).append("\n");
        menuDetails.append("Active: ").append(getPeriod()).append("\n\n");
        
        menuDetails.append("Entree:\n");
        menuDetails.append(entree).append("\n\n");
            
        menuDetails.append("Main Course:\n");
        menuDetails.append(mainCourse).append("\n\n");
               
        menuDetails.append("Dessert:\n");
        menuDetails.append(dessert).append("\n\n");
        
        menuDetails.append("Drink:\n");
        menuDetails.append(drink).append("\n\n");
        
        return menuDetails.toString();
    }
    
    
}
