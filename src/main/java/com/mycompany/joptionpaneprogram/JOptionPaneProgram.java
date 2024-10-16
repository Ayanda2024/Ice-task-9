/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpaneprogram;

import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class JOptionPaneProgram {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       //Declarations
       int b = 4,c = 7;
       
       String num1, num2;
       int product=b*c;
       int division=b/c;
      
        num1=JOptionPane.showInputDialog(null,"Enter the first number");
       b=Integer.parseInt(num1);
       
       num2=JOptionPane.showInputDialog(null,"Enter the second number");
       c=Integer.parseInt(num2);
        boolean running=true;
       
        while(running){
         String options=JOptionPane.showInputDialog(null,"Choose an operation for the two values\n"+
                 "1.Addition\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division\n"+"0.Exit");
         
         switch(options){
             case "1":JOptionPane.showMessageDialog(null,"The sum of "+b+"&"+c+"is"+(b+c)) ;
             break;
             
             case "2":JOptionPane.showMessageDialog(null,"The subtraction of"+b+"&"+c+"is"+(b-c));
             break;
             
             case "3":JOptionPane.showMessageDialog(null,"The multiplication of "+b+"&"+c+"is"+b+"*"+c+"="+product);
             break;
           
             case "4": JOptionPane.showMessageDialog(null,"The division of "+b+"&"+c+"is"+b+"/"+c+"="+division);
             
         
             case "0":JOptionPane.showMessageDialog(null,"Exiting");
             System.exit(0);
             break;
             default:
                 JOptionPane.showMessageDialog(null,"Calculation not recognnised");
                 
                 
       
        }
         
        }
    }
}
       
       
     
    



