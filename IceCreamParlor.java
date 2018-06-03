/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class So{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int letters[]=new int [27];
        int count = 0;
	int l=str.length();
	for(int i=0;i<l;i++)
	{   char c =str.charAt(i);
            if(letters[c-'a']==0)
		count++;
            letters[c-'a']++;
		}
		
	int a1=0;
	int counta1=0;
	int counta2=0;
	int ans=1;
	int a2=0;
	for(int i=0;i<26;i++){
            if(letters[i]>0){
		if(a1==0){
                    
                    a1=letters[i];
                    counta1++;
                    continue;}
            if(a1>0 ){
                if(a2 == 0){
                    if(letters[i]!=a1){
                    
                    a2=letters[i];
                    counta2++;
                    continue;}}}
            if(a1> 0&& a2>0){
                if(letters[i]!=a1 && letters[i]!=a2){
                    ans=0;
                    break;}}
            if(a1 == letters[i]){
		counta1++;
		continue;}
            if(a2 == letters[i]){
		counta2++;
		continue;}
		}
	}
	
		
		if(counta1>1 && counta2>1){
                    ans =0;}
                if (ans==0){
		System.out.println("NO");}
                else{
		System.out.println("YES");
		
	}}
    
}