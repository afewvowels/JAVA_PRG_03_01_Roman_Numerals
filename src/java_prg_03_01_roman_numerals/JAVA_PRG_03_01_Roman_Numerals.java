/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_01_roman_numerals;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that prompts the user to enter a number within the range of
 * 1 through 10. The program should display the Roman numeral version of that
 * number. If the number is outside the range of 1 through 10, the program
 * should display an error message.
 */
public class JAVA_PRG_03_01_Roman_Numerals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables for user input
        int intUserInput;
        
        String strUserInput;
        
        strUserInput = JOptionPane.showInputDialog("Please enter a number\n" +
                "between 1 and 10");

        intUserInput = Integer.parseInt(strUserInput);;
        
        switch(intUserInput)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "I");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "I");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "II");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "III");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "IV");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "VI");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "VII");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "VIII");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "IX");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "X");
                break;
            default:
                JOptionPane.showMessageDialog(null, "There was an error");
        }
        
        System.exit(0);
    }
    
}
