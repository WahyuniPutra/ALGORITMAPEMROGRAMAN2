package praktikum1;

public class sequential {

	public static void main(String[] args) {
        int[] data = {99,20,17,8,27,5,21,10,41,11}; 
        int cari=8; 
        int i; 
        boolean ditemukan = false; 
    for(i=0; i < data.length; i++){ 
        if (data[i] == cari){ 
            ditemukan=true; 
            break; 
        } 
    } 
    if (ditemukan) { 
        System.out.println("Data : " + cari + " Ditemukan Pada Index :"+ i +"."); 
    } 
    else{ 
        System.out.println("Data Tidak di temukan"); 
    }    
      }
	}

/*Program diatas adalah sebuah implementasi dari algoritma pencarian sequential atau linear search dalam
bahasa pemrograman Java. Algoritma ini mencari sebuah nilai tertentu di dalam sebuah array dengan cara memeriksa
setiap elemen array secara berurutan dari awal hingga akhir, hingga nilai yang dicari ditemukan atau sampai akhir 
array tercapai. Jika nilai yang dicari ditemukan, maka program akan menampilkan pesan bahwa data tersebut ditemukan 
beserta indeksnya di dalam array. Jika tidak ditemukan, maka program akan menampilkan pesan bahwa data tersebut tidak ditemukan.*/