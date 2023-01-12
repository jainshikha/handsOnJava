package com.graph.solutions;

/*
 * Write a program to find is path exist for given nodes of graph.
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
 */
public class IsPathExistRecursion {

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
		
		boolean[] visitor = new boolean[size+1];
		boolean output = isPath(2, 7, graph, visitor);
		System.out.println("Is path: " + output);
	}

	private static boolean isPath(int source, int destination, Graph graph, boolean[] visitor) {
		visitor[source] = true;
		if(source == destination) {
			return true;
		}
		
		for(int child : graph.getElements(source)) {
			if (!visitor[child]) {
				boolean isComplete = isPath(child, destination, graph, visitor);
				if(isComplete) {
					return true;
				}
			}
		}
		return false;
	}

}
