/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;
import static java.lang.Character.*;

/**
 *
 * @author aziza
 */
public class Vasya {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int count = 0;
        String s1 = "hello";
        String[] sss = s.split("");
        String[] sss1 = s1.split("");
        while(count!=4){
            for (int i = 0; i < sss.length; i++) {
            if(sss[i].equals(sss1[count]) ){
                count++;
            } 
            }}
        
    }

}
