/*
4,1 Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a
route between two nodes. 
*/
class One_Route {
	enum State {
		Unvisited, Visited, Visiting;
	}
	boolean search(Graph graph, Node start, Node end) {
		if(start == end) return true;
	}
	// Queue
	LinkedList<Node> q = new LinkedList<>();
	for(Node u: graph.getNodes()){
		u.state = State.Unvisited;
	}
	start.state = State.Visiting;
	q.add(start);
	Node u;
	while(!q.isEmpty()) {
		u = q.removeFirst();
		if(u != null) {
			for(Node v: u.getAdjacent()) {
				if(v.state == State.Unvisited) {
					if(v == end) {
						return true;
					}
					else {
						v.state = State.Visiting;
						q.add(v);
					}
				}
			}
			u.state = State.Visited;
		}
	}
	return false;
}
}





// second

/*
Find if there is a path between two vertices in a directed graph
Given a Directed Graph and two vertices in it, check whether there is a path from the first given vertex to second. 
For example, in the following graph, there is a path from vertex 1 to 3. As another example, there is no path from 3 to 0.

*/

import java.util.*;
class Graph{
	private int V;
	private LinkedList<Integer> adj[];

	Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for(int i = 0; i< v; i++){
			adj[i] = new LinkedList();
		}
	}
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	Boolean isReachable(int s, int d) {
		LinkedList<Integer> temp; // create a queue for BFS
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[s] = true;
		queue.add(s);

		Iterator<Integer> i;
		while(queue.size() != 0) {
			s = queue.poll();
			int n;
			i = adj[s].listIterator();

			while(i.hasNext()) {
				n = i.next();
				if(n == d) return true;
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		int u = 1, v = 3;
		if(g.isReachable(u, v)){
			System.out.println("there is a path from " + u + " to " + v);
		}
		else {
			System.out.println("there is no path from " + u + " to " + v);
		}
	}
}
