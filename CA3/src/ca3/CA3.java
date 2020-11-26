/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author diese
 */
public class CA3 {
    
    static double getNumber (){
        /*
        * Author: Leonardo Diesel
        */
        double a=0.0;
        while (a==0.0){
            try{            
                BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
                a=Double.parseDouble(myReader.readLine());
            } catch (Exception e){   
                System.out.println("You did not insert a number!");
            }
        }
        return a;
    }
    
    static double multNumb (double a, double b){
        double mult=a*b;
        return mult;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Running a Multiplication of Two Numbers!");
        System.out.println("Type a number and press 'ENTER', then type another number and press 'ENTER'");
        System.out.println("The result of the multiplication of these two numbers is "+multNumb(getNumber(),getNumber()));
    }
    
}
