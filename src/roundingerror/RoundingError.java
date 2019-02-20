/*
 * Quentin Magoon
 * February 19, 2019
 * Compares the square of the square root of any number
 */

package roundingerror;

import javax.swing.*;

public class RoundingError {

    public static void main(String[] args) {
        
        double input; //user input
        double square; //input squared
        double root; // square, square rooted
        double output; //output
        
        //Asks user for number
        String inputStr = JOptionPane.showInputDialog("Please enter a number");
        
        //Convert the year from a String to an int
     	input = Double.parseDouble(inputStr);
        
        //Calculations
        root = Math.sqrt(input);
        square = Math.pow(root,2);
        output = root - square;
        
        //displays values
        System.out.println("The square of the square = " + square );
        System.out.println("The round off error = " + output);
    }
    
}
