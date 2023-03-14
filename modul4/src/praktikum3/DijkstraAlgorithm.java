package praktikum3;

public class DijkstraAlgorithm {
	public static void dijkstraAlgorithm(int[ ][ ] graph, int source) {
	    int count = graph.length;
	    boolean[ ] visitedVertex = new boolean[count];
	    int[ ] distance = new int[count];
	    for (int i = 0; i < count; i++) {
	      visitedVertex[i] = false;
	      distance[i] = Integer.MAX_VALUE;
	    }
	    distance[source] = 0; 
	    for (int i = 0; i < count; i++) { 
	      int u = findMinDistance(distance, visitedVertex);
	      visitedVertex[u] = true;

	      for (int v = 0; v < count; v++) {
	        if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
	          distance[v] = distance[u] + graph[u][v];
	        } } 
	    }
	    for (int i = 0; i < distance.length; i++) {
	      System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
	    }
	  }
	 
	  private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
	    int minDistance = Integer.MAX_VALUE;
	    int minDistanceVertex = -1;
	    for (int i = 0; i < distance.length; i++) {
	      if (!visitedVertex[i] && distance[i] < minDistance) {
	        minDistance = distance[i]; 
	        minDistanceVertex = i;
	      }
	    }
	    return minDistanceVertex;
	  }
	 
	  public static void main(String[ ] args) {
	    int graph[ ][ ] = new int[ ][ ] { { 0, 10, 7, 0, 15}, { 10, 0, 9, 6, 5}, { 7, 9, 0, 2, 8}, 
	  { 0, 6, 2, 0, 4}, { 15, 5, 8, 4, 0} };
	    DijkstraAlgorithm T = new DijkstraAlgorithm();
	    T.dijkstraAlgorithm(graph, 0);
	  } 

}

/*Program Java di atas merupakan implementasi dari algoritma Dijkstra untuk mencari jalur terpendek di antara beberapa titik di sebuah graf. 
 * Pada program ini, terdapat method "dijkstraAlgorithm" yang menerima parameter berupa matriks representasi graf dan titik awal (source) untuk 
 * dihitung jarak terpendeknya. Pertama, method ini melakukan inisialisasi untuk setiap simpul di graf dengan jarak tak terhingga (Integer.MAX_VALUE) 
 * dan visitedVertex ke false. Kemudian, distance[source] di-set menjadi 0. Selanjutnya, program melakukan perhitungan jarak terpendek menggunakan nested loop. 
 * Di dalam nested loop ini, setiap simpul akan dicari jarak terpendeknya ke setiap simpul yang belum dikunjungi. Proses ini akan berhenti saat semua simpul 
 * telah dikunjungi atau saat tidak ada simpul yang dapat dikunjungi. Akhirnya, program akan menampilkan jarak terpendek dari titik awal ke setiap simpul menggunakan 
 * loop terakhir pada method. Method "findMinDistance" juga merupakan method yang digunakan untuk mencari simpul dengan jarak terpendek di setiap iterasi. 
 * Selain itu, terdapat method "main" yang digunakan untuk menginisialisasi matriks graf dan memanggil method "dijkstraAlgorithm" untuk mencari jarak terpendek dari 
 * simpul 0 ke setiap simpul lainnya.*/
