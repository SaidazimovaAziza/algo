/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;

/**
 *
 * @author aziza
 */
public class SumandProductoOfToNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sum:");
        int xsumy= input.nextInt();
        System.out.print("Product:");
        int xprody= input.nextInt();
        int discriminant=(xsumy*xsumy)-4*xprody;
        double x1=(xsumy+Math.sqrt(discriminant))/2;
        double x2=(xsumy-Math.sqrt(discriminant))/2;
        System.out.println(x1);
        System.out.println(x2);
        
        
   
    }
    
}
