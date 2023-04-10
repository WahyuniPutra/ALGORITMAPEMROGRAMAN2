package Responsi;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MaxFlow {
	    public static int findMaxFlow(int[][] graph, int source, int sink, int V) {
	        int maxFlow = 0;

	        int[][] residualGraph = new int[V][V];
	        for (int u = 0; u < V; u++)
	            for (int v = 0; v < V; v++)
	                residualGraph[u][v] = graph[u][v];

	        int[] parent = new int[V];

	        while(BFS(residualGraph, source, sink, V, parent)) {
	            int path_flow = Integer.MAX_VALUE;
	            for (int v = sink;v != source; v = parent[v]) {
	                int u = parent[v];
	                path_flow = Math.min(path_flow, residualGraph[u][v]);
	            }
	            for (int v = sink;v != source; v = parent[v]) {
	                int u = parent[v];
	                residualGraph[u][v] -= path_flow;
	            }
	            maxFlow += path_flow;
	        }

	        return maxFlow;
	    }
	    
/*Method findMaxFlow menghitung aliran maksimum pada grafik menggunakan algoritma Ford-Fulkerson. 
Pertama-tama, ia membuat residualGraph sebagai grafik sisa yang diinisialisasi dengan nilai yang 
sama dengan grafik awal. Kemudian, ia menjalankan BFS pada residualGraph untuk mencari jalur 
peningkatan aliran dari sumber ke tujuan. Jika jalur peningkatan ditemukan, ia menghitung aliran
minimum pada jalur tersebut dan mengupdate residualGraph sesuai dengan nilai tersebut. Kemudian, i
a menambahkan aliran minimum tersebut ke maxFlow dan mengulang proses hingga
tidak ada jalur peningkatan yang ditemukan lagi*/

	    public static boolean BFS(int[][] graph, int source, int sink, int V, int[] parent) {
	        boolean[] visited = new boolean[V];
	        Arrays.fill(visited, false);
	        Queue<Integer> q = new LinkedList<>();
	        q.add(source);
	        visited[source] = true;
	        parent[source] = -1;
	        while(!q.isEmpty()) {
	            int u = q.poll();
	            for(int v=0;v<V;v++) {
	                if(!visited[v] && graph[u][v] > 0) {
	                    q.add(v);
	                    parent[v] = u;
	                    visited[v] = true;
	                }
	            }
	        }
	        return visited[sink];
	    }
	    
/*Method BFS mencari jalur terpendek dari sumber ke tujuan di dalam residualGraph. Ia menggunakan array 
visited untuk melacak node yang sudah dikunjungi dan array parent untuk melacak node yang terhubung
 pada jalur terpendek dari sumber ke tujuan. Kemudian, ia menambahkan node yang belum dikunjungi 
dan masih terhubung dengan sisa kapasitas di antrian q.*/
	    
		  public static void main(String [] args) {
			  int[][] graph = new int[][]{    
				  {0, 7, 4, 1, 0, 0, 0},
	              {0, 0, 0, 3, 4, 0, 0},
	              {0, 0, 0, 0, 1, 0, 0},
	              {0, 0, 0, 0, 0, 7, 0},
	              {0, 0, 4, 0, 0, 0, 5},
	              {0, 0, 0, 0, 0, 0, 9},
	              {0, 0, 0, 0, 0, 0, 0}  
	              };

		        int V = graph.length;
		        System.out.println("Maximum Flow A - G Adalah : "+findMaxFlow(graph, 0, V-1, V));
		    }
/*Method main membuat grafik sebagai array dua dimensi dan menjalankan method findMaxFlow pada grafik
tersebut dengan sumber pada indeks 0 
dan tujuan pada indeks terakhir. Hasilnya dicetak pada konsol.*/ 

}
