/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpet;

/**
 * Nicolas Lei,
 * September 17
 * To display the price of the carpet
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lenght = 8.5;
        double width = 6;
        double permeter = 19.95;
        double cost = 0.0;
        
        // Cost of the carpet
        cost = lenght * width * permeter;
        System.out.println("The cost of the carpet is " + cost + " dollar in totle");
    }
    
}
