/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author aziza
 */
public class increaseArray {
    
    public static void main(String[] args) {
       Stack mystack = new Stack();
       int x =0;
       System.out.println("1 3 2 5 3 4");
       int [] arr = new int[]{1,3,2,5,3,4};
       mystack.push(0);
       for(int i = arr.length-1; i>=0; i--){
           if(mystack.size()>0&&(int)mystack.peek()<arr[i]){
               while(mystack.size()>0&&(int)mystack.peek()<=arr[i]){
               mystack.pop();
               }
                if(mystack.size()==0){ 
                     mystack.push(arr[i]);
                 arr[i] = 0;
                }
                else{
                x=(int)mystack.peek();
                mystack.push(arr[i]);
                arr[i]=x;
                }
                
            }
           
           else if(mystack.size()>0&&(int)mystack.peek()>arr[i]){
               x = (int)mystack.peek();
               mystack.push(arr[i]);
               arr[i]=x;
            }
       }
       
       for(int i = 0; i<arr.length; i++){
           System.out.print(arr[i]);
       }
    }
    
            
            
            
            
            }
    
    
            
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    

