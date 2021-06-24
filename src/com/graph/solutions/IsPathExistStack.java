package com.graph.solutions;

import java.util.Stack;

/*
 * Write a program to find is Path exist for given nodes of graph.
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
 * Output:  TRUE
 * 
 * Note: using Stack
 */
public class IsPathExistStack {

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
		
		
		boolean output = isPath(2, 6, graph);
		System.out.println("Is path: " + output);
	}

	private static boolean isPath(int source, int destination, Graph graph) {
		boolean[] visitor = new boolean[graph.size()];
		visitor[source] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		
		while(!stack.isEmpty()) {
			int current = stack.pop();
			if (current == destination) {
				return true;
			}
			for(int child : graph.getElements(current)) {
				if (!visitor[child]) {
					stack.add(child);
					visitor[child] = true;
				}
			}
		}
		return false;
	}

}
