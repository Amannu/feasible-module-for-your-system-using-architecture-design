/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipeandfilter;

/**
 *
 * @author User
 */
public class making_phase {
    
    public class Vegetables implements Runnable{
    
    @Override
    public void run() {
        System.out.println("preparing vegetables...");
        System.out.println("Choping Vegitabeles...");
        System.out.println("Vegitabeles Prepared!");
    }
    }
    public class Sauce implements Runnable{
    
    @Override
    public void run() {
        System.out.println("preparing sauce ingredients...");
        System.out.println("Making sauce...");
        System.out.println("sauce Prepared!");
    }
   
    
    }
    public class PizzaBase implements Runnable{
    
    @Override
    public void run() {
        System.out.println("preparing pizza dough ingredients...");
        System.out.println("Making pizza dough...");
        System.out.println("Making pizza base...");
        System.out.println("pizza base Prepared!");
    }
    
}
    public void main(String[] args) {
        System.out.println("creating the basic elements for the pizza.......");
        Vegetables V= new Vegetables();
        Thread VegetableT= new Thread(V);
        VegetableT.start();
        Sauce S= new Sauce();
        Thread SauceT= new Thread(S);
        SauceT.start();
        PizzaBase P= new PizzaBase();
        Thread PizzaBaseT= new Thread(P);
        PizzaBaseT.start();
        }
    public String getVegetable(){
        
        return "Vegetables";
    }
    public String getSauce(){
        return "Sauce";
    }
    public String getPizzaBase(){
        return "Pizza Base";
    }
    
        }
        

