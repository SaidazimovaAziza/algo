/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aziza
 */
public class MuseumNewMethod {
    public static void main(String[] args){
        List<Integer> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Количество людей:");
        String ni= input.nextLine ();
        int n=Integer.parseInt(ni);
        int k=0;
        int max=0;
        int []array1=new int[n];
        int []array2=new int[n];
        for(int i=0;i<n;i++){
            String s= input.nextLine();
            String[] time=s.split(" ");
            String[] login=time[0].split(":");
            int time1 = (Integer.parseInt(login[0])*60)+(Integer.parseInt(login[1]));
            array1[i]=time1;
            String[] logout=time[1].split(":");
            int time2 = (Integer.parseInt(logout[0])*60)+(Integer.parseInt(logout[1]));
            array2[i]=time2;
            Arrays.sort(array1);
            Arrays.sort(array2);
        }
        int h=0,s = 0,y=0;
        for(int j=0;j<array1.length;j++){
            h=array1[j];
            for(int z=0;z<array2.length;z++)
                y=array2[z];
                    for (int d=0;d<array1.length;d++)
                        s =array1[d];
                        if (h<s & s<y)
                            k++;
                        
                                
                    
                        k++;
                        if (k>max)
                            max=k;
        }
        System.out.println(max);
        
                        
    
    
    
    }
    
}
