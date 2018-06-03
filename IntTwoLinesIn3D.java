/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;

/**
 *
 * @author aziza
 */
public class IntTwoLinesIn3D {
    public static void main(String []args){
        int A[]=new int[]{5,5,2};
        int B[]=new int[]{10,3,6};
        int C[]=new int[]{5,7,5};
        int D[]=new int[]{10,10,3};
        int s1[]=new int[3];
        int t1[]=new int[3];
        int CA[]=new int[3];
        int s;
        int t;
        for(int i=0;i<3;i++){
            s1[i]=B[i]-A[i];
            t1[i]=D[i]-C[i];
            CA[i]=C[i]-A[i];
        }
          
            s=(B[0]*C[1]-A[1]*B[0]-B[1]*C[0]+A[1]*B[1])/(D[0]*B[1]-B[0]*D[1]);
        
        
        
           t=C[0]+D[1]*s-A[0];
            int x=A[0]+B[0]*t;
            int y=A[1]+B[1]*t;
            int z=A[2]+B[2]*t;
            System.out.print("("+x+", "+y+", "+z+"  )");
            
        }
        
            
        
        
        
        
    
    
    
    
    
    
    }
    
    

