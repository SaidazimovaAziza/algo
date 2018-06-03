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
public class GraphEx2 {
     public static void main(String[]args){
    
    int index=-1; 
    int n= 5;
    int []res=new int [5];
    int[]s=new int[5];
    int []resr=new int [5];
    int[][] solution = new int [][]{ { 0, 2, 0, 0, 7 },                          
                               { 2, 0, 1, 0, 3 }, 
                               { 0, 1, 0, 0, 2 },	                         
                               { 0, 0, 2, 0, 0 },
                                { 7, 3, 2, 2, 0 }};
    boolean r=true;
    int b=0;
    for (int k=0;k<n;k++){
        int count=10;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(i==k){
                   if(i==0){
                   if(solution[k][j]!=0){
                        res[k]=solution[i][j];
                        if(res[k]<count){
                            count=res[k];
                            resr[k]=count;
                            b=j;
                            index++;
                            s[k]=i+1;
                        }
                    }}
                   else{
                       if(j>=b){
                            if(solution[k][j]!=0){
                                count=Math.min(solution[k][j],count);
                                resr[k]=count;
                                b=j;
                                index++;
                            s[k]=i+1;}}
                           
                       
                        else
                            {solution[i][j]=0;}
                   }
               }
                    
                
                }
            }
       
    }
    for(int i=0;i<index;i++)
        System.out.print(resr[i]);
    
    
    }
   

    
} 
 
    
    
    

