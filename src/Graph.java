import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * Created by DefinitePurple on 26-Apr-17.
 */
public class Graph {
    class Node {
        public int vert;
        public int weight;
        public Node next;
    }

    // V = number of vertices
    // E = number of edges
    // adj[] is the adjacency lists array
    private int V, E;
    private Node[] adj;
    private Node z;
    private int[] mst;

    // used for traversing graph
    private int[] visited;
    private int id;

    // default constructor
    public Graph(int _V, int _E) throws IOException {
        V = _V;
        E = _E;

        // create sentinel node
        z = new Node();
        z.next = z;

        // create adjacency lists, initialised to sentinel node z
        adj = new Node[V + 1];
        for (int v = 1; v <= V; ++v)
            adj[v] = z;

        connectAllEdges();
    }

    // convert vertex into char for pretty printing
    private char toChar(int u) {
        return (char) (u + 64);
    }

    // method to display the graph representation
    public void display() {
        int v;
        Node n;

        for (v = 1; v <= V; ++v) {
            System.out.print("\nadj[" + toChar(v) + "] ->");
            for (n = adj[v]; n != z; n = n.next)
                System.out.print(" |" + toChar(n.vert) + " | " + n.weight + "| ->");
        }
        System.out.println("");
    }

    public void connectAllEdges(){
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i ++){
            if(visited[i] != true) {
                Random random = new Random();
                int x1 = i;
                int x2 = random.nextInt(V - 1) + 1;
                Node newNode = new Node();
                newNode.vert = x1;
                newNode.next = adj[x1];
                adj[x1] = newNode;
                visited[x1] = true;

                newNode.vert = x1;
                newNode.next = adj[x2];
                adj[x2] = newNode;
                visited[x2] = true;
            }
        }
    }
}
