public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian() {}

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    public void tampilkanTransaksi() {
        System.out.println("===== Transaksi Pengisian BBM =====");
        kendaraan.tampilkanInformasi();
        System.out.println("Jenis BBM    : " + bbm.namaBBM);
        System.out.println("Harga/liter  : " + bbm.hargaPerLiter);
        System.out.println("Jumlah Liter : " + liter);
        System.out.println("Total Bayar  : " + totalBayar);
        System.out.println("===================================");
    }
}