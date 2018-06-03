/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author aziza
 */
public class HeapSort {
    public ArrayList<Integer> Sort(int A[]) {

        for (int i = (A.length - 2)/2; i >= 0; i--) {
            heapify(A, i);
        }
        ArrayList <Integer> ar= new ArrayList<>();
        while(A.length>0) {
            int temp = A[0];
            A[0] = A[A.length-1];
            A[A.length-1] = temp;
            
            ar.add(A[A.length-1]);
            A=Arrays.copyOf(A, A.length-1);
            heapify(A, 0);
        }
        return ar;
    }

    void heapify(int A[], int i) {
        int smallest = i;  
        int l = 2 * i + 1;  
        int r = 2 * i + 2; 

      
        if (l < A.length && A[l] > A[smallest]) {
            smallest = l;
        }

        if (r < A.length && A[r] > A[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            int temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;
            heapify(A, smallest);
        }
    }
    public static void main(String args[]) {
        int A[] = {112, 8, 120, 9, 67, 90, 50};

        HeapSort hs = new HeapSort();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        
        arr=hs.Sort(A);
        

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

    
}
