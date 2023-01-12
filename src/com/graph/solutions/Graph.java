package com.graph.solutions;

import java.util.LinkedList;

/*
 * This implementation is called Adjacency List. Every vertex (or Node) stores a list of adjacent vertices.
 * In a undirected graph, an edge like (a,b) would be stored twice - once in a's adjacency vertices and 
 * once in b's adjacency vertices.
 * 
 * Implementation can be -
 * 1. Array of LinkedList - where array index is node and linkedList is adjacency vertices.
 * 2. Map of LinkedList - where map entry is node and linkedList is adjacency vertices.
 */
public class Graph {

	private LinkedList<Integer> graph[] = null;
	
	public Graph(int size) {
		graph = new LinkedList[size + 1];
		for(int i=0; i<=size; i++) {
			graph[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		graph[source].add(destination);
		graph[destination].add(source);
	}
	
	public int size() {
		return graph.length;
	}
	
	public LinkedList<Integer> getElements(int vertex) {
		return graph[vertex];
	}
}
