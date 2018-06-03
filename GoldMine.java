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
public class GoldMine {
    public static void main(String[]args){
        int n=4;
        int m=4;
        
        int A[][]=new int[][]{ { 1, 3, 1, 5 },                          
                               { 2, 2, 4, 1 }, 
                               { 5, 0, 2, 3 },	                         
                               { 0, 6, 1, 2 }};;
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                int right=A[i][j-1];
                int rightUp=0;
                if(i-1 >= 0){
                rightUp=A[i-1][j-1];}
                int rightDown=0;
                if(i+1<n){
                rightDown=A[i+1][j-1];}
                A[i][j]=A[i][j]+Math.max(Math.max(right, rightUp),Math.max(rightUp, rightDown));
            
            }
        
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
            System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    
    }
    
}
