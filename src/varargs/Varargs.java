/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varargs;

/**
 *
 * @author hunnytaggy
 */
public class Varargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] temperature = {7.5, 8.2, 7.7, 11.3, 10.75};
        System.out.println("Sending Array");
        displayTemps(temperature);
        System.out.println();
        System.out.println("Sending individual items");
        displayTemps(7.5, 8.2, 7.7, 11.3, 10.75);
        displayTemps(9.9);
        displayTemps();
    }

    private static void displayTemps(double... temperatureIn) {
        System.out.println();
        System.out.println("*** TEMPERATURES ***");
        System.out.println("Number of temperatures: "+ temperatureIn.length);
        
        // display temperatures
        for(double item : temperatureIn){
            System.out.println(item);
        }
    }
    
}
