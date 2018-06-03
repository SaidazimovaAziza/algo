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
public class FloydWarshall {
    public static void main (String[]args){
        int[][] dist = new int [][]{ { 0, 5, 4, 10},                          
                               { 1, 0, 3, 2 }, 
                               { 3, 5, 0, 1},	                         
                               { 1, 2, 3, 0 }};
        int V=4;
        
        
        for (int k = 0; k < V; k++){
            for (int i = 0; i < V; i++){
                for (int j = 0; j < V; j++){
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(dist[i][j]);
            }
            System.out.println();
        }
    
    
    }
    
}
