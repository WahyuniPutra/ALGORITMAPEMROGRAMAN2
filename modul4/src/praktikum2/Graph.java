package praktikum2;
import java.util.Arrays;

class Graph {
  class Edge implements Comparable<Edge> {
    int src, dest, weight;
    public int compareTo(Edge compareEdge) {
      return this.weight - compareEdge.weight;
    }  }
 
  class subset {
    int parent, rank;
  }
  int vertices, edges;
  Edge edge[ ];
  Graph(int v, int e) {
    vertices = v;
    edges = e;
    edge = new Edge[edges];
    for (int i = 0; i < e; ++i)
      edge[i] = new Edge();
  }
 
  int find(subset subsets[ ], int i) {
    if (subsets[i].parent != i)
      subsets[i].parent = find(subsets, subsets[i].parent); 
    return subsets[i].parent;
  }
 
  void Union(subset subsets[ ], int x, int y) {
    int xroot = find(subsets, x);
    int yroot = find(subsets, y);
 
    if (subsets[xroot].rank < subsets[yroot].rank)
      subsets[xroot].parent = yroot;
    else if (subsets[xroot].rank > subsets[yroot].rank)
      subsets[yroot].parent = xroot;
    else {
      subsets[yroot].parent = xroot;
      subsets[xroot].rank++;
    }  }
 
  void KruskalAlgo() {
    Edge result[ ] = new Edge[vertices];
    int e = 0;
    int i = 0;
    for (i = 0; i < vertices; ++i)
      result[i] = new Edge();
    
    Arrays.sort(edge);
    subset subsets[ ] = new subset[vertices];
    for (i = 0; i < vertices; ++i)
      subsets[i] = new subset();
 
    for (int v = 0; v < vertices; ++v) {
      subsets[v].parent = v;
      subsets[v].rank = 0;
    }
    i = 0;
    while (e < vertices - 1) {
      Edge next_edge = new Edge(); 
      next_edge = edge[i++];
      int x = find(subsets, next_edge.src);
      int y = find(subsets, next_edge.dest);
      if (x != y) {
        result[e++] = next_edge;
        Union(subsets, x, y);
      }
    }
    for (i = 0; i < e; ++i)
      System.out.println(result[i].src + " - " + result[i].dest + ": " + result[i].weight);
  }
 
  public static void main(String[ ] args) {
    int vertices = 5; // Number of vertices
    int edges = 7; // Number of edges
    Graph G = new Graph(vertices, edges);
 
    G.edge[0].src = 0;
    G.edge[0].dest = 1;
    G.edge[0].weight = 1;
 
    G.edge[1].src = 0;
    G.edge[1].dest = 2;
    G.edge[1].weight = 7;
 
    G.edge[2].src = 1;
    G.edge[2].dest = 2;
    G.edge[2].weight = 5;
 
    G.edge[3].src = 1;
    G.edge[3].dest = 3;
    G.edge[3].weight = 4;
 
    G.edge[4].src = 1;
    G.edge[4].dest = 4;
    G.edge[4].weight = 3; 

    G.edge[5].src = 2; 
    G.edge[5].dest = 4;
    G.edge[5].weight = 6;
 
    G.edge[6].src = 3;
    G.edge[6].dest = 4;
    G.edge[6].weight = 2;
    G.KruskalAlgo();
  }
}

/*Program Java di atas merupakan implementasi dari algoritma Kruskal untuk mencari minimum spanning tree dari sebuah graph 
berarah dan terhubung. Program tersebut menggunakan package "java.util.Arrays" untuk melakukan sorting pada array edge 
yang digunakan dalam algoritma Kruskal.

Kelas Graph terdiri dari kelas Edge yang memuat atribut src, dest, dan weight, serta method compareTo() yang 
mengimplementasikan Comparable interface untuk melakukan perbandingan bobot antara dua edge. Kelas Graph juga memiliki 
inner class subset yang berisi atribut parent dan rank, yang digunakan untuk melakukan union-find dalam algoritma Kruskal.

Pada method KruskalAlgo(), edge-edge yang ada di graph diurutkan terlebih dahulu menggunakan Arrays.sort(). 
Kemudian, dilakukan loop untuk membuat array subsets dan menginisialisasi parent dan rank untuk setiap vertex. 
Selanjutnya, dilakukan loop untuk memproses setiap edge yang telah diurutkan, dimana setiap edge akan diuji untuk
 dilihat apakah terdapat cycle dengan menggunakan method find() dan Union(). Jika tidak ditemukan cycle, edge tersebut 
akan dijadikan sebagai bagian dari minimum spanning tree, dan akan dicetak pada akhir program.

Pada method main(), graph berupa array of edges diinisialisasi dan diisi dengan vertex, sumber, tujuan, dan bobot edge-nya.
 Kemudian, objek Graph dibuat dan KruskalAlgo() dipanggil untuk mencari minimum spanning tree dari graph tersebut.*/