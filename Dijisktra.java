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
public class Dijisktra {
  static int V=5;
  public static void printSolution(int dist[], int n) {
        int src = 0;
        for (int i = 0; i < V; i++) {
            if (i == 4) {
            System.out.print("Distance from first vertex " + src + " to last -> " + (i + 1) + " is = " + dist[i]);
            
}}}
    public static void shortest(int graph[][], int src)
    {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        
        for (int count = 0; count < V-1; count++){
            int min = Integer.MAX_VALUE, 
            min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
            int u =min_index;
 
            sptSet[u] = true;
 
            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v]){
                        dist[v] = dist[u] + graph[u][v];}
        }
 
        printSolution(dist, V);
    }
 
   
    public static void main (String[] args)
    {
       int graph[][] = new int[][]{{0, 4, 0, 0, 0},
                                  {4, 0, 8, 0, 0},
                                  {0, 8, 0, 7, 0},
                                  {0, 0, 7, 0, 9},
                                  {0, 0, 0, 9, 0}};
        
      shortest(graph, 0);
}
}
