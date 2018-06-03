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
public class NewClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ss = input.nextInt();
        int [] l=new int[ss];
        int in=0;
        for(int i=0;i<ss;i++){
            int c = input.nextInt();
            l[in]=c;
            in++;
        }
        int s = input.nextInt();
        int [] arr = new int[s];
        int index=0;
        for(int i=0;i<s;i++){
            int cc = input.nextInt();
            arr[index]=cc;
            index++;
        }
         for (int i = 0; i < l.length; i++) {
            int sss=0;
            for (int j = 0; j < arr.length; j++) {
                sss+=l[i];
                if(ss <= arr[j]){
                    System.out.println(i+1+" ");
                    break;
                }
                else{
                    continue;
                }
            }        
        }
        
        
        
    
    }
    
}
