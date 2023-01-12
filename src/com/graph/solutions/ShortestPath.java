package com.graph.solutions;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Write a program to find shortest path for given nodes of graph.
 * 						1
 * 					  / |  \
 * 					2	|	3
 * 					\   5	/
 * 					 \	/\ /
 * 					  4   6
 * 						  \
 * 						   7
 * 
 * Input: 2, 7
 * Output:  7 -- 6 -- 5 -- 1 -- 2
 *			Shortest path: 4
 */
public class ShortestPath {

	public static void main(String[] args) {
		int size = 7;
		Graph graph = new Graph(size);
		graph.addEdge(1, 2);
		graph.addEdge(1, 5);
		graph.addEdge(1, 3);
		graph.addEdge(3, 6);
		graph.addEdge(6, 7);
		graph.addEdge(5, 6);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		
		int output = shortestPath(2, 7, graph);
		System.out.println();
		System.out.println("Shortest path: " + output);
	}

	private static int shortestPath(int source, int destination, Graph graph) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visitor = new boolean[graph.size()];
		int[] parantor = new int[graph.size()];
		
		queue.add(source);
		visitor[source] = true;
		parantor[source] = -1;
		while(!queue.isEmpty()) {
			int current = queue.poll();
			if(current == destination) {
				break;
			}
			for(int child : graph.getElements(current)) {
				if (!visitor[child]) {
					queue.add(child);
					visitor[child] = true;
					parantor[child] = current;
				}
			}
		}
		int current = destination;
		int distance = 0;
		while(parantor[current] != -1) {
			System.out.print(current + " -- ");
			current = parantor[current];
			distance++;
		}
		System.out.print(source);
		return distance;
	}

}
