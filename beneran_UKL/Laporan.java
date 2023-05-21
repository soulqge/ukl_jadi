package beneran_UKL;

public class Laporan {
    public void laporan(Client client){
        int x = client.jumlahC();

        System.out.println("----------------------------------");
        System.out.println("Data Client");
        System.out.println("----------------------------------");
        System.out.println("ID \tNama \tAlamat \tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+client.getNama(i)+"\t"+client.getAlamat(i)+"\t"+client.getTelp(i)+"\t"+client.getSaldo(i));
        }
    }
    public void laporan(Petugas petugas){
        int x = petugas.getJumlahP();

        System.out.println("----------------------------------");
        System.out.println("Tabel Petugas");
        System.out.println("----------------------------------");
        System.out.println("ID \tNama \tAlamat \tTelepon \tJabatan");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+petugas.getNama(i)+"\t"+petugas.getAlamat(i)+"\t"+petugas.getTelp(i)+"\t"+petugas.getJabat(i));
        }
    }
    
    public void laporan (Transaksi transaksi, JenisLaundry jL){
        int x = transaksi.getJmlTransaksi();

        System.out.println("----------------------------------");
        System.out.println("Laporan Transaksi");
        System.out.println("----------------------------------");
        System.out.println("\tJenis Laundry \tDurasi \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getHarga(i);
            total += jumlah;

            System.out.println("\t" + jL.getJenis(transaksi.getJenis(i))+"\t"+jL.getDurasi(transaksi.getJenis(i))+"\t"+transaksi.getDurasi(i)+"\t"+jumlah);
        }
        System.out.println("Total Omset: "+total);
    }

}
