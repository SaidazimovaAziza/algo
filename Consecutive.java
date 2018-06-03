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
public class Consecutive {
    public static void main(String[] args) {
        int num=0;
        int max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("binary string: ");
        String s=input.nextLine();
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)=='0')
                num++;
            else 
                num=0;
            if(num > max)
                max = num;
                
                
                    
                
            }
        System.out.print(max);
               
        
                        
                        
            
                
        
        
        
        
   
    }
    
}
