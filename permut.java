/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aziza
 */
public class permut {
    static ArrayList<Integer>aa=new ArrayList();
    static ArrayList<Integer>bb=new ArrayList();
    static ArrayList<Integer>cc=new ArrayList();
    public static void main(String []args){
        String a ="1234";
        String b="4352";
        String c="6755";
        int n = a.length();
        char []arraya = new char[100];
        String []arrayb=new String[100];
        String []arrayc=new String[100];
        int []ara=new int [200];
        permut permutation = new permut();
        permutation.permute(a, 0, n-1,aa);
        permutation.permute(b, 0, n-1,bb);
        permutation.permute(c, 0, n-1,cc);
        int co=0;
        for(int i:aa){ 
            for(int j:bb){ 
                    for(int f:cc){
                        if(i+j==f){
                            System.out.println(i+"+"+j+"="+f);
                            co++;}}}}
        System.out.println(co); 
}
  
        
            
        
    
    private void permute(String str, int l, int r,ArrayList name)
    {
        if (l == r)
            name.add(Integer.parseInt(str));
        else
        {
            for (int i = l; i <= r; i++)
            {
                
                str=swap(str,l,i);
                permute(str, l+1, r,name);
                str=swap(str,l,i);
            }
        }
    }
 
    public String swap(String a, int i, int j)
    {
        char temp;
        char [] array = a.toCharArray();
        temp = array[i] ;
        array[i] = array[j];
        array[j] = temp;
        return String.valueOf(array);
        
    }
    
}
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

