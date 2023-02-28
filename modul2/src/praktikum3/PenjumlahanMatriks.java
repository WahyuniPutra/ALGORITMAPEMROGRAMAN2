package praktikum3;

import java.util.Scanner;

public class PenjumlahanMatriks {
    
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        int a,b,c,d;
        int matriksA [][] = new int [3][3];
        int matriksB [][] = new int [3][3];
        int hasil [][]    = new int [3][3];
        Scanner input     = new Scanner (System.in);
        
        clearScreen();
        System.out.println("=====================================================");
        System.out.println("------------- PENJUMLAHAN MATRIKS 2x3 ---------------");
        System.out.println("=====================================================");
        System.out.print("Masukkan Jumlah Baris Matriks : "); a = input.nextInt();
        System.out.print("Masukkan Jumlah Kolom Matriks : "); b = input.nextInt();
        
        System.out.println("Masukkan Element Matriks Pertama : ");
        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                System.out.print("[" +(c+1) + "] [" +(d+1) + "] "); // tambahkan + untuk penggabungan string
                matriksA[c][d] = input.nextInt();
            }
        }
        
        System.out.println("Masukkan Element Matriks Kedua : ");
        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++) {
                System.out.print("[" +(c+1) + "] [" +(d+1) + "] "); // tambahkan + untuk penggabungan string
                matriksB[c][d] = input.nextInt();
            }
        }
        
        System.out.println("Hasil Penjumlahan Matriks : ");
        for (c = 0; c < a; c++){
            for (d = 0; d < b; d++) {
                hasil[c][d] = matriksA[c][d] + matriksB[c][d]; // ubah index matriks dari [a][b] ke [c][d]
                System.out.print(hasil[c][d] + "\t"); // tambahkan "" untuk mengubah int ke string
            }
            System.out.println();
        }
        
        input.close(); // tambahkan close() pada akhir program
    }

}

/*Pada baris 1-2, dilakukan deklarasi package dan import Scanner.
Pada baris 4-10, terdapat method clearScreen() yang digunakan untuk membersihkan layar.
Pada baris 12-29, terdapat method main() yang merupakan program utama untuk melakukan penjumlahan matriks.
Pada baris 14-16, terdapat deklarasi variabel a,b,c,d yang merupakan ukuran matriks dan variabel matriksA, matriksB, dan hasil.
Pada baris 17, terdapat deklarasi Scanner input untuk membaca input dari pengguna.
Pada baris 19-23, digunakan method clearScreen() untuk membersihkan layar dan mencetak judul program.
Pada baris 24-25, digunakan input.nextInt() untuk membaca input jumlah baris dan kolom matriks dari pengguna.
Pada baris 27-35, dilakukan perulangan untuk membaca matriks pertama dan menyimpan nilainya pada variabel matriksA.
Pada baris 37-45, dilakukan perulangan untuk membaca matriks kedua dan menyimpan nilainya pada variabel matriksB.
Pada baris 47-54, dilakukan perulangan untuk melakukan penjumlahan matriks dan menyimpan hasilnya pada variabel hasil.
Pada baris 56-57, digunakan System.out.println() untuk mencetak hasil penjumlahan matriks.
Pada baris 58-61, digunakan System.out.println() untuk mencetak hasil penjumlahan matriks.
Pada baris 63, digunakan input.close() untuk menutup Scanner input dan menghindari memory leak. */