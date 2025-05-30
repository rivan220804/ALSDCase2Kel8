import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int pilih;
        do {
            System.out.println("\n===== MENU SPBU =====");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor       : ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan  : ");
                    String jenis = sc.nextLine();
                    System.out.println("Masukkan Merk Kendaraan : ");
                    String merk = sc.nextLine();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
