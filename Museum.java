/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aziza
 */
public class Museum {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Количество людей:");
        String ni= input.nextLine ();
        int n=Integer.parseInt(ni);
        int k;
        for(int i=0;i<n;i++){
            String s= input.nextLine();
            
            String[] time=s.split(" ");
            String[] login=time[0].split(":");
            int time1 = (Integer.parseInt(login[0])*60)+(Integer.parseInt(login[1]));
            String[] logout=time[1].split(":");
            int time2 = (Integer.parseInt(logout[0])*60)+(Integer.parseInt(logout[1]));
            words.add(time1); 
            words.add(time2);
            
            
        }
        
        int count=0;
        int g=0;
        ArrayList<Integer>maxx=new ArrayList();
        for (int i=0;i<words.size()/2;i++){
            for(int j=0;j<words.size();j=j+2){
                if (words.get(j)<=words.get(g)&& words.get(g)<=words.get(j+1)){
                count++;
                
                }
            }
            maxx.add(count);
            count=0;
            g=g+2;
            
                    
        }
        System.out.print(Collections.max(maxx));
                    
        
        
            
            
            
            
        
            
            
        
    
    
    
    
    }
}
