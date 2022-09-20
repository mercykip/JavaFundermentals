package com.example.JavaFundermentals.JavaFundermentals.graph;

import ch.qos.logback.core.subst.Node;

import java.util.LinkedList;

public class GraphList {
    LinkedList<Integer>[] adj;
    private int V;
    private int E;

    GraphList(int nodes) {
        this.V = nodes;
        this.E = 0;// initially there are no  edges
        //initialize an array of linked list with the number of nodes, iterate over every vertex
        this.adj = new LinkedList[nodes];
        //iterate over each vertex
        for (int v = 0; v < V; v++) {
            this.adj[v] = new LinkedList<>();
        }
    }


    public void addNode(Node node) {

    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
        E++;

    }

    public void checkEdge(int source, int destination) {

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        //initiallize the graph with the number of nodes
        GraphList gp = new GraphList(4);
        //add edges
        gp.addEdge(0, 1);
        gp.addEdge(1, 2);
        gp.addEdge(2, 3);
        gp.addEdge(3, 0);
        System.out.println(gp);
    }

}
