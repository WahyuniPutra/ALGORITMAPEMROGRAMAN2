package Praktikum3;

import java.io.IOException;
import java.util.Scanner;

public class Data_Tabel {
	
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

	static boolean isRunning = true;

	static void daftarMobil() {
		System.out.println("=====================================");
		System.out.println("------------ Daftar Mobil -----------");
		System.out.println("=====================================");
		System.out.println("1. Jaguar\n2. Lamborgini\n3. Honda\n4. Audi\n5. Suzuki\n6. Mazda\n7. Daihatsu\n8. Ford\n9. Hyundai\n10. Mitsubishi");
		System.out.println("=====================================");
	}

	static void cariMobil() {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Brand Mobil : ");
		String value = scan.nextLine();
		boolean ada = false;
		String[] produk = { "Jaguar", "Lamborgini", "Honda", "Audi", "Suzuki", "Mazda", "Daihatsu", "Ford", "Hyundai",
				"Mitsubishi" };
		String[] harga = { "1.340.000.000", "34.500.000.000", "350.000.000", "2.000.000.000", "245.000.000", "500.000.000",
				"169.000.000", "789.000.000", "122.900.000", "278.100.000" };

		for (i = 0; i < produk.length; i++) {
			if (produk[i].equals(value)) {
				ada = true;
				break;
			}
		}
		if (ada) {
			System.out.println("");
			System.out.println("Nama Brand Mobil " + produk[i] + " Ditemukan Pada Index Ke - " + i);
			System.out.println("Mobil Seharga : " + "Rp. " + harga[i]);
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("Data Mobil Tidak Ditemukan!");
		}
	}

	static void mengurutkanMobil() {
		Scanner input = new Scanner(System.in);
		String[] produk = { "Jaguar", "Lamborgini", "Honda", "Audi", "Suzuki", "Mazda", "Daihatsu", "Ford", "Hyundai",
				"Mitsubishi" };
		long[] harga = { 1340000000, 34500000000L, 350000000, 2000000000, 245000000, 500000000, 169000000, 789000000,
				122900000, 278100000 };
		System.out.println("");
        int n = harga.length;
        long temp = 0;
        String tempStr = "";

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (harga[j - 1] > harga[j]) {
                    // swap harga
                    temp = harga[j - 1];
                    harga[j - 1] = harga[j];
                    harga[j] = temp;

                    // swap produk
                    tempStr = produk[j - 1];
                    produk[j - 1] = produk[j];
                    produk[j] = tempStr;
				}
			}
		}
		System.out.println("Urutan Termurah Hingga Termahal");
		for (int i = 0; i < 10; i++) {
			System.out.println("Produk Mobil " +produk[i]+ " Seharga Rp. " + harga[i]);
		}
	}

	static void menunjukMobil() {
		String[] produk = { "Jaguar", "Lamborgini", "Honda", "Audi", "Suzuki", "Mazda", "Daihatsu", "Ford", "Hyundai",
				"Mitsubishi" };
		String[] harga = { "1.340.000.000", "34.500.000.000", "350.000.000", "2.000.000.000", "245.000.000", "500.000.000",
				"169.000.000", "789.000.000", "122.900.000", "278.100.000" };
		String search = "169.000.000";
		int i;
		boolean find = false;

		for (i = 0; i < harga.length; i++) {
			if (harga[i] == search) {
				find = true;
				break;
			}
		}
		if (find) {
			System.out.println("");
			System.out.println("Harga Mobil Termurah Ke-2");
			System.out.println("Brand Mobil " + produk[i] + " Seharga " + search);
		} else {
			System.out.println("Data Tidak DItemukan!");
		}
	}

	static void mainMenu() {
		int menu;
		Scanner scan = new Scanner(System.in);
		clearScreen();
		daftarMobil();
		System.out.println("=============== MENU ================");
		System.out.println("1. Cari Data Mobil\n2. Urutkan Harga Mobil\n3. Mobil Termurah Ke 2\n4. Keluar");
		System.out.print("Pilih Menu : ");
		menu = scan.nextInt();
		switch (menu) {
			case 1:
				cariMobil();
				break;
			case 2:
				mengurutkanMobil();
				break;
			case 3:
				menunjukMobil();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Input Salah!");
		}

	}

	public static void main(String[] args) throws IOException {
		do {
			mainMenu();
		} while (isRunning);

	}

}

/*Program di atas merupakan program Java yang memiliki package dengan nama Praktikum3. Package ini memiliki satu class yang bernama Data_Tabel. Program ini menyediakan beberapa method untuk mengakses data mobil, seperti mencari data mobil, mengurutkan harga mobil, dan menunjukkan harga mobil termurah kedua.

Di dalam class Data_Tabel terdapat beberapa method, di antaranya:

clearScreen(): method ini digunakan untuk membersihkan layar konsol.

daftarMobil(): method ini digunakan untuk menampilkan daftar mobil yang tersedia.

cariMobil(): method ini digunakan untuk mencari mobil berdasarkan nama brand mobil yang dimasukkan pengguna. Method ini akan menampilkan hasil pencarian berupa nama brand mobil dan harga mobil yang sesuai.

mengurutkanMobil(): method ini digunakan untuk mengurutkan harga mobil dari termurah hingga termahal. Method ini akan menampilkan daftar nama brand mobil beserta harga mobil yang telah diurutkan.

menunjukMobil(): method ini digunakan untuk menunjukkan harga mobil termurah kedua. Method ini akan menampilkan nama brand mobil dan harga mobil termurah kedua.

mainMenu(): method ini digunakan untuk menampilkan menu utama dan meminta input dari pengguna untuk memilih salah satu dari empat opsi menu yang tersedia. Opsi menu yang tersedia adalah mencari data mobil, mengurutkan harga mobil, menunjukkan harga mobil termurah kedua, dan keluar dari program.

Program ini juga menggunakan beberapa class dari library Java, yaitu:

java.io.IOException: class ini digunakan untuk menangani eksepsi yang terkait dengan masukan dan keluaran (I/O) pada program.

java.util.Scanner: class ini digunakan untuk membaca masukan dari pengguna melalui konsol.*/
