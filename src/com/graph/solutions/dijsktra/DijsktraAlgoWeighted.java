package com.graph.solutions.dijsktra;

import java.util.List;
import java.util.PriorityQueue;

public class DijsktraAlgoWeighted {

	public static void main(String[] args) {
		int nodes = 5;
		Graph graph = new Graph(nodes);
		graph.addEdge(0, 1, 5);
		graph.addEdge(0, 3, 8);
		graph.addEdge(1, 2, 6);
		graph.addEdge(1, 3, 9);
		graph.addEdge(3, 2, 2);
		graph.addEdge(3, 4, 7);
		graph.addEdge(2, 4, 4);
		graph.addEdge(4, 1, 5);
		
		int output = minDistance(0, 4, graph);
		System.out.println("Output: " + output);
		System.out.println("Shortest Path: ");
		graph.shortestPath(4);
	}

	private static int minDistance(int source, int destination, Graph graph) {
		if (source == destination) {
			return 0;
		}
		PriorityQueue<Edge> minHeap = new PriorityQueue<>((e1, e2) -> e1.distance - e2.distance);
		graph.distance[source] = 0;
		graph.parentor[source] = -1;
		minHeap.add(new Edge(source, 0));
		
		while(!minHeap.isEmpty()) {
			Edge current = minHeap.poll();
			if (graph.visitor[current.node]) {
				continue;
			}
			graph.visitor[current.node] = true;
			List<Edge> childs = graph.graph.get(current.node);
			for(Edge child : childs) {
				if (!graph.visitor[child.node] && (graph.distance[current.node] + child.distance < graph.distance[child.node])) {
					graph.distance[child.node] = graph.distance[current.node] + child.distance;
					graph.parentor[child.node] = current.node;
					child.distance = graph.distance[current.node] + child.distance;
					minHeap.add(child);
				}
			}
		}
		return graph.distance[destination];
	}

}
