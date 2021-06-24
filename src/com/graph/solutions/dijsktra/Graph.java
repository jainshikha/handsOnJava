package com.graph.solutions.dijsktra;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	List<List<Edge>> graph = null;
	int[] distance = null;
	boolean[] visitor = null;
	int[] parentor = null;
	
	public Graph(int nodes) {
		graph = new ArrayList<>();
		distance = new int[nodes];
		visitor = new boolean[nodes];
		parentor = new int[nodes];
		
		for(int i=0; i<nodes; i++) {
			graph.add(i, new ArrayList<>());
			distance[i] = Integer.MAX_VALUE;
		}
	}
	
	public void addEdge(int source, int destination, int distance) {
		graph.get(source).add(new Edge(destination, distance));
	}
	
	public void shortestPath(int destination) {
		int current = destination;
		while(parentor[current] != -1) {
			System.out.print(current + " -- ");
			current = parentor[current];
		}
		System.out.print(current);
	}
}

class Edge {
	int node;
	int distance;
	
	public Edge(int targetNode, int distance) {
		this.node = targetNode;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Edge [node=" + node + ", distance=" + distance + "]";
	}

	public int getNode() {
		return node;
	}

	public int getDistance() {
		return distance;
	}
}