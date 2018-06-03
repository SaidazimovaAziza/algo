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
public class PolygonArea {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt ();
        int polygon_x[]=new int [n];
        int polygon_y[]=new int[n];
        double ar = 0;
        double centerx=0;
        double centery=0;
        double center_x;
        double center_y;
        double area=0;
        for(int i=0;i<polygon_x.length;i++){
            System.out.print("x"+i+": ");
            polygon_x[i]=input.nextInt();
            System.out.print("y"+i+": ");
            polygon_y[i]=input.nextInt();
        
        }
        for(int j=0;j<polygon_x.length;j++){
            if (j==n-1){
              ar=ar+(polygon_x[j]*polygon_y[0])-(polygon_y[j]*polygon_x[0]); 
            }
            else{
            ar=ar+(polygon_x[j]*polygon_y[j+1])-(polygon_y[j]*polygon_x[j+1]);
            }
        
        
        }
        double ans=Math.abs(ar/2);
        
        System.out.println("First way: "+ans);
        for(int k=0;k<polygon_x.length;k++){
            centerx=centerx+polygon_x[k];
            centery=centery+polygon_y[k];
        
        
        }
        center_x=centerx/n;
        center_y=centery/n;
        for(int l=0;l<polygon_x.length;l++){
            if (l==n-1){
                double d1=Math.sqrt(((polygon_x[l]-polygon_x[0])*(polygon_x[l]-polygon_x[0]))+((polygon_y[l]-polygon_y[0])*(polygon_y[l]-polygon_y[0])));
                double d2=Math.sqrt(((polygon_x[l]-center_x)*(polygon_x[l]-center_x))+((polygon_y[l]-center_y)*(polygon_y[l]-center_y)));
                double d3=Math.sqrt(((polygon_x[0]-center_x)*(polygon_x[0]-center_x))+((polygon_y[0]-center_y)*(polygon_y[0]-center_y)));
                double perimeter=(d1+d2+d3)/2;
                area=area+Math.sqrt(perimeter*(perimeter-d1)*(perimeter-d2)*(perimeter-d3));
              
            }
            else{
                double d1=Math.sqrt(((polygon_x[l]-polygon_x[l+1])*(polygon_x[l]-polygon_x[l+1]))+((polygon_y[l]-polygon_y[l+1])*(polygon_y[l]-polygon_y[l+1])));
                double d2=Math.sqrt(((polygon_x[l]-center_x)*(polygon_x[l]-center_x))+((polygon_y[l]-center_y)*(polygon_y[l]-center_y)));
                double d3=Math.sqrt(((polygon_x[l+1]-center_x)*(polygon_x[l+1]-center_x))+((polygon_y[l+1]-center_y)*(polygon_y[l+1]-center_y)));
                double perimeter=(d1+d2+d3)/2;
                area=area+Math.sqrt(perimeter*(perimeter-d1)*(perimeter-d2)*(perimeter-d3));
                
            }
        
        
        }
        
        System.out.println("Second way: "+area);
        
       
        
    
    
    }
    
}
