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
public class GraphEx1 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    int n= input.nextInt ();
    int []res=new int [n];
    int[][] solution = new int [n][n];
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            solution[i][j]=input.nextInt();
    
    for (int k=0;k<n;k++){
        int count=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==k){
                count=count+solution[k][j];
                }
            }
    }
    res[k]=count;}
    
    for (int k=0;k<n;k++){
        int count=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(j==k){
                count=count+solution[i][k];
                }
            }
    }
    res[k]=res[k]+count;}
                
    for(int i=0;i<n;i++)                
        System.out.print(res[i]+" ");
    
    
    
    }
    
}
