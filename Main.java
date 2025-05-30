import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKendaraan queue = new QueueKendaraan(10);
        LinkedListTransaksi transaksiList = new LinkedListTransaksi();

        int pilih;
        do {
            System.out.println("\n===== MENU SPBU =====");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu    : ");
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
                    Kendaraan kendaraan = new Kendaraan(plat, jenis, merk);
                    queue.tambahAntrian(kendaraan);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;

                case 2:
                    queue.tampilAntrian();
                    break;

                case 3:
                    System.out.println("Jumlah kendaraan dalam antrian: " + queue.getSize());
                    break;

                case 4:
                    System.out.print("Masukkan nomor plat yang ingin dilayani: ");
                    String platDilayani = sc.nextLine();
                    Kendaraan dilayani = queue.cariKendaraan(platDilayani);
                    if (dilayani != null) {
                        System.out.print("Nama BBM        : ");
                        String namaBBM = sc.nextLine();
                        System.out.print("Harga per Liter : ");
                        double harga = sc.nextDouble();
                        System.out.print("Jumlah Liter    : ");
                        double liter = sc.nextDouble();
                        sc.nextLine();

                        BBM bbm = new BBM(namaBBM, harga);
                        TransaksiPengisian t = new TransaksiPengisian(dilayani, bbm, liter);
                        transaksiList.tambah(t);
                        System.out.println(">> Transaksi Berhasil dicatat.");
                    }
                    break;

                case 5:
                    System.out.println("==== Riwayat Transaksi ====");
                    transaksiList.tampilkan();
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
