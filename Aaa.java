/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author aziza
 */


import java.util.Scanner;

/**
 *
 * @author aziza
 */
public class Aaa {
     public static void main(String[]args){
    
    
    int n= 5;
    int []res=new int [5];
    int[][] solution = new int [][]{ { 0, 2, 0, 0, 7 },                          
                               { 2, 0, 1, 0, 3 }, 
                               { 0, 1, 0, 0, 2 },	                         
                               { 0, 0, 0, 0, 2 },
                                { 7, 3, 2, 2, 0 }};
    int a=0;
    int b=0;
    int r=0;
    while(r!=1){
    for (int k=0;k<n;k++){
        int count=10;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==k){
                   if(i==0){
                   if(solution[k][j]!=0){
                        count=Math.min(solution[k][j],count);
                        res[k]=count;
                        b=j;
                        a=i+1;
                        }
                    }
                   else{
                       if(j>=b){
                           if(i==n-1){
                               r=1;
                           }
                            if(solution[k][j]!=0){
                                count=Math.min(solution[k][j],count);
                                res[k]=count;
                                b=j;
                                a=i+1;}
                           
                       }
                        else
                            {solution[i][j]=0;}
                   }
               }
                    
                
                }
            }
       
    }}
    for(int i=0;i<n;i++){
        System.out.print(res[i]+"");}
    }}
    
    

    

    
    
    


