package praktikum4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayKaryawan {
    public static void main(String[] args) {
        DataKaryawan dataKar = new DataKaryawan();
        MyInput input1 = new MyInput();

        System.out.print("Berapa jumlah karyawan: ");
        dataKar.setJmlKaryawan(input1.bacaInt());

        for (int i = 0; i < dataKar.getJmlKaryawan(); i++) {
            System.out.println("Karyawan ke-" + (i + 1));
            System.out.print("Masukan NIK : ");
            dataKar.setNIK(i, input1.bacaString());
            System.out.print("Masukan Nama : ");
            dataKar.setNama(i, input1.bacaString());
            System.out.print("Masukan Gaji Pokok : ");
            dataKar.setGapok(i, input1.bacaInt());
        }

        dataKar.tampilData();
    }

    static class MyInput {
        public String bacaString() {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            String string = "";
            try {
                string = bfr.readLine();
            } catch (IOException ex) {
                System.out.println(ex);
            }
            return string;
        }

        public int bacaInt() {
            return Integer.parseInt(bacaString());
        }
    }

    static class DataKaryawan {
        private String[] nik = new String[100];
        private String[] nama = new String[100];
        private int[] gapok = new int[100];
        private int jmlKaryawan;

        public void setNIK(int i, String x) {
            this.nik[i] = x;
        }

        public void setNama(int i, String x) {
            this.nama[i] = x;
        }

        public void setGapok(int i, int x) {
            this.gapok[i] = x;
        }

        public float rerataGapok() {
            int sum = 0;
            for (int i = 0; i < this.jmlKaryawan; i++) {
                sum += this.gapok[i];
            }
            return (float) sum / this.jmlKaryawan;
        }

        public void setJmlKaryawan(int x) {
            this.jmlKaryawan = x;
        }

        public int getJmlKaryawan() {
            return this.jmlKaryawan;
        }

        public void tampilData() {
            System.out.println("====================================");
            System.out.println("NIK\tNAMA\t\tGAJI");
            System.out.println("====================================");
            for (int i = 0; i < this.jmlKaryawan; i++) {
                System.out.println(String.format("%-5s\t%-20s\tRp %10d", nik[i], nama[i], gapok[i]));
            }
            System.out.println("====================================");
            System.out.println("Rata-rata gaji pokok dari " + this.jmlKaryawan + " karyawan adalah Rp " + rerataGapok());
        }
    }
}

/*Program diatas merupakan sebuah program Java yang terdiri dari tiga class: "arrayKaryawan", "dataKaryawan", dan "MainProgram".

Class "dataKaryawan" berfungsi untuk menyimpan data karyawan seperti NIK, nama, dan gaji pokok serta dapat menampilkan data karyawan dan rata-rata gaji pokok dari karyawan yang diinputkan.

Class "MainProgram" berfungsi sebagai main program atau program utama, dimana program akan mengambil input dari pengguna untuk menginputkan data karyawan berdasarkan jumlah karyawan yang diinputkan.

Class "arrayKaryawan" berisi method bacaString() dan bacaInt() yang digunakan untuk membaca input dari pengguna. Namun, class ini tidak digunakan secara langsung dalam program dan hanya sebagai tambah*/
