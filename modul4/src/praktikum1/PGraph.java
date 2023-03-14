package praktikum1;
import java.util.Arrays;

public class PGraph {

	public void Prim(int G[][], int V) {
        int INF = 9999999;
        int no_edge; 
        boolean[] selected = new boolean[V];
        Arrays.fill(selected, false);
        no_edge = 0;
        selected[0] = true;
        System.out.println("Edge : Weight");
 
        while (no_edge < V - 1) { 
        int min = INF;
        int x = 0; // row number
        int y = 0; // col number
 
        for (int i = 0; i < V; i++) {
           if (selected[i] == true) {
             for (int j = 0; j < V; j++) {
                 if (!selected[j] && G[i][j] != 0) {
                     if (min > G[i][j]) {
                          min = G[i][j]; 
                          x = i; 
                          y = j;
              } } } }
         }
        System.out.println(x + " - " + y + " :  " + G[x][y]);
        selected[y] = true;
        no_edge++;
       }
       } 

public static void main(String[] args) { 
    PGraph g = new PGraph();
 int V = 4;
 int[][] G = { { 0, 1, 4, 3 }, { 1, 0, 0, 2 }, { 4, 0, 0, 5}, { 3, 2, 5, 0}};
 g.Prim(G, V); 
}

}


/* Program Java di atas adalah sebuah implementasi algoritma Prim untuk mencari MST (Minimum Spanning Tree) pada sebuah graf berbobot. Program ini menggunakan package java.util.Arrays yang berisi metode untuk mengisi dan memanipulasi array.
Pada metode Prim, program memulai dengan memilih simpul awal sebagai simpul dengan indeks 0, lalu menandai simpul ini sebagai telah dipilih. Kemudian, program mencari sisi terpendek yang terhubung dengan simpul yang telah dipilih dan yang 
belum dipilih. 

Jika ada beberapa sisi terpendek, program akan memilih satu yang terdapat di antara simpul yang telah dipilih. Kemudian simpul terhubung yang baru dipilih akan ditandai sebagai telah dipilih dan program akan terus mencari sisi terpendek sampai
semua simpul telah dipilih. Program ini menerima matriks representasi graf dengan bobot. Setiap elemen matriks merepresentasikan bobot dari sisi yang menghubungkan dua simpul. Jika suatu sisi tidak ada, maka nilainya akan diisi dengan 0. 
Variabel INF merepresentasikan nilai tak terhingga untuk merepresentasikan sisi yang tidak terhubung.
Metode Prim dipanggil pada fungsi main dengan membuat objek PGraph dan memberikan matriks G dan jumlah simpul V sebagai parameter. Program akan menampilkan MST dengan menampilkan simpul yang terhubung dan bobot sisi yang menghubungkannya. */
