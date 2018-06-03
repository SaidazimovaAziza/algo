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
public class Knapsack {
    public static void main(String []args){
    int n=7;
    int w=19;
    int []p=new int[5];
   
    p[0]=5;
    p[1]=7;
    p[2]=9;
    p[3]=11;
    p[4]=13;
    int [][]A=new int[p.length][w];
    for(int i=1;i<p.length;i++){
        for (int j=1;j<w;j++){

        if (j-p[i]>=0){
            A[i][j]=Math.max(A[i-1][j],A[i-1][j-p[i]]+p[i]);
            
        
        }
        else{
            A[i][j]=A[i-1][j];
            
        }
       }}
    int max=0;
    for(int i=0;i<p.length;i++){
        for(int j=0;j<w;j++){
            if(A[i][j]>max)
                max=A[i][j];
        }
    }
    System.out.print(max);
    
    
    
    }

    
    
    }
    
    
    
    
    

