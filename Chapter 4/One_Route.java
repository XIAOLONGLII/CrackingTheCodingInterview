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
