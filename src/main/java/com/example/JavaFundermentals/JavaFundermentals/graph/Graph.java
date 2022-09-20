package com.example.JavaFundermentals.JavaFundermentals.graph;

//Adjacency Matrix undirected graph
public class Graph {

    private int V; //number of vertices in the graph
    private int E; //number of edges in the graph
    private int[][] adjMatrix;//two dimentional array

    public Graph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];//initialize the matrix with the number of nodes
    }

    //add an edge from U to V and V to U since it's an undirected graph
    //to understand better assume  U to be the source and V to be  destination, you can move from destination to source and also source to destination.
    public void addEdges(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
        //increament the counter edge by 1
        E++;
    }

    //String representation of the graph
    //there are different ways to display a graph, research on other best ways of displaying graphs
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            //iterate over adjacency matrix for a particular vertex
            for (int w : adjMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //a graph of 4 nodes
        Graph g = new Graph(4);
        g.addEdges(0, 1);
        g.addEdges(1, 2);
        g.addEdges(2, 3);
        g.addEdges(3, 0);
        System.out.println(g);
    }
}
