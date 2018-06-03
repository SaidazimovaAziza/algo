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
public class king {
    public static void main(String[] args){
        int count=8;
        int a1=0;
        int b1=1;
        int c1=2;
        int d1=3;
        int e1=4;
        int f1=5;      
        int g1=6; 
        int h1=7;
        int col=0;
        Scanner input = new Scanner(System.in);
        System.out.print("binary string: ");
        String s=input.nextLine();
        String[] sss = s.split("");
        
        if(s.charAt(0)=='a' || s.charAt(0)=='h'){
            if(s.charAt(1)=='1' || s.charAt(1)=='8'){
                count=count-5;
            }
            else{
                count=count-3;
            }
        }
        else{
            if(s.charAt(1)=='1' || s.charAt(0)=='8'){
                count=count-3;}
            else{
            }
        }
        
        
            
    
        System.out.println(count);
    
    
    }
    
}
