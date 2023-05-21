package beneran_UKL;


public class Laundry {

    public static void main(String[] args) {
        Client client = new Client();
        Petugas petugas = new Petugas();
        JenisLaundry jL = new JenisLaundry();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        transaksi.prosesT(client, jL, petugas, laporan);
    }
}
