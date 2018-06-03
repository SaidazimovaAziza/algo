/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author aziza
 */
public class Sudoku {
    public static void main(String[] args){
        
        String []a;
        Scanner input = new Scanner(System.in);
        System.out.print("Количество:");
        String ni= input.nextLine ();
        int n=Integer.parseInt(ni);
        int[][] solution = new int [n*n][n*n];
        System.out.println("Enter the values of a Sudoku solution");
        for(int i=0;i<n*n;i++)
            for(int j=0;j<n*n;j++)
                solution[i][j]=input.nextInt();
        if(sudokuCheck(solution)==true)
            System.out.println("Correct");
        else
            System.out.println("Not correct");
           
        
    }
    public static boolean sudokuCheck(int[][] s)
  {for(int row = 0; row < 9; row++)
   for(int col = 0; col < 8; col++)
      for(int col2 = col + 1; col2 < 9;col2++)
         if(s[row][col]==s[row][col2]){
            return false;}


for(int col = 0; col < 9; col++)
   for(int row = 0; row < 8; row++)
      for(int row2 = row + 1; row2 < 9; row2++)
         if(s[row][col]==s[row2][col]){
            return false;}


for(int row = 0; row < 9; row += 3)
   for(int col = 0; col < 9; col += 3)
      for(int pos = 0; pos < 8; pos++)
         for(int pos2 = pos + 1; pos2 < 9; pos2++)
            if(s[row + pos%3][col + pos/3]==s[row + pos2%3][col + pos2/3]){
               return false;}
        return true;
    
    
      
  }
        
    
 
    
    
    
    }
    

