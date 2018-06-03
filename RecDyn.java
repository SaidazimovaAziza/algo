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
public class RecDyn {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Количество:");
        int n= input.nextInt();
        int [][] matrix=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix [i][j]=input.nextInt();
            }
        }
        int [][] result=new int[n][n];
        
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0 & j==0){
                    result[0][0]=matrix[0][0];
                }
                else if(j==0){
                    result[i][j]=matrix[i][j]+result[i-1][n-1];}
                else {
                    result[i][j]=matrix[i][j]+result[i][j-1];}
            }
        }
        int max=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (max<result[i][j]){
                    max=result[i][j];
                }
                    
            }
        }
        System.out.print(max);
        
    }
    
}
