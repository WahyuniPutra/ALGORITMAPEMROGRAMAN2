package praktikum2;

public class binary {

	public static void main(String[] args) {
        int N = 8; 
        int A [] = {5,2,9,7,1,6,8,3}; 
        int BatasAtas, BatasBawah, Tengah; 
        int cari = 2; 
 
        BatasAtas = 0; 
        BatasBawah = N - 1; 
        Tengah = 0; 
        boolean ketemu; 
        ketemu = false; 
    
        while((BatasAtas <= BatasBawah) && (ketemu == false)){ 
            Tengah = (BatasAtas + BatasBawah) / 2; 
            if (A[Tengah] == cari){ 
                ketemu = true; 
            } else 
                if (A[Tengah] <= cari){ 
                BatasAtas = Tengah + 1; 
            } else { 
                BatasBawah = Tengah - 1; 
            } 
 
        } 
        if (ketemu) { 
            System.out.println ("Angka : "+ cari + " Data berada di index  nomor " + Tengah); 
        }  
        else { 
            System.out.println ("Angka :" + cari + "Data tidak ditemukan"); 
        } 
    } 

}

/*Program tersebut adalah sebuah implementasi dari algoritma pencarian binary search atau pencarian biner dalam bahasa pemrograman 
Java. Algoritma ini mengasumsikan bahwa array yang digunakan sudah terurut. Pencarian dimulai dengan membandingkan nilai yang dicari 
dengan elemen tengah dari array. Jika nilai yang dicari lebih besar dari elemen tengah, maka pencarian dilanjutkan pada setengah bagian 
kanan array, dan sebaliknya jika nilai yang dicari lebih kecil dari elemen tengah, maka pencarian dilanjutkan pada setengah bagian kiri
array. Algoritma ini berlanjut hingga nilai yang dicari ditemukan atau seluruh array telah diperiksa. Jika nilai yang dicari ditemukan,
maka program akan menampilkan pesan bahwa data tersebut ditemukan beserta indeksnya di dalam array. Jika tidak ditemukan, maka program 
akan menampilkan pesan bahwa data tersebut tidak ditemukan*/
