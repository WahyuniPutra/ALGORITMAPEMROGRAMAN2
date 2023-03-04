package arraykaryawan;

public class dataKaryawann {
    public static void main(String[] args) {
        int i;
        clearScreen();
        dataKaryawan dataKar = new dataKaryawan();
        myInput input1 = new myInput();
        System.out.println("Berapa jumlah karyawan: ");
        dataKar.setJmlKaryawan(input1.bacaInt());
        for (i = 0; i < dataKar.n; i++) {
            System.out.println("Karyawan ke- " + (i + 1));
            System.out.print("Masukan NIK : ");
            dataKar.setNIK(i, input1.bacaString());
            System.out.print("Masukan Nama : ");
            dataKar.setNama(i, input1.bacaString());
            System.out.print("Masukan Gaji Pokok : ");
            dataKar.setGapok(i, input1.bacaInt());
        }
        clearScreen();
        dataKar.tampilData();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
