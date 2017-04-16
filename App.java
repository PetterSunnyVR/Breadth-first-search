package BFS;

public class App {
	
	public static void main(String[] args) {
		
		//create new algorythm object
		BFS bfs = new BFS();
		
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		Vertex vertex6 = new Vertex(6);
		Vertex vertex7 = new Vertex(7);
		Vertex vertex8 = new Vertex(8);
		Vertex vertex9 = new Vertex(9);
		Vertex vertex10 = new Vertex(10);
		
		//vertex1 is gooing to be the root
		//		  1
		//		 / \  \
		//		2   4  6
		//		|   |  |  \  
		//		3   5  7  8
		//               /  \
		//              9   10
		//the order of adding vertices doesn't play the role in BFS
		
		vertex1.addNeighbourVertex(vertex2);
		vertex1.addNeighbourVertex(vertex4);
		vertex4.addNeighbourVertex(vertex5);
		vertex2.addNeighbourVertex(vertex3);
		vertex1.addNeighbourVertex(vertex6);
		vertex6.addNeighbourVertex(vertex7);
		vertex6.addNeighbourVertex(vertex8);
		vertex8.addNeighbourVertex(vertex9);
		vertex8.addNeighbourVertex(vertex10);
		
		bfs.bfs(vertex1);
	}
	
}
