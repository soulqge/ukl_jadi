
package beneran_UKL;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    
    ArrayList<Integer> idClient = new ArrayList<>();
    ArrayList<Integer> idJenis = new ArrayList<>();
    ArrayList<Integer> durasi = new ArrayList<>();
    ArrayList<Integer> banyak = new ArrayList<>();
    ArrayList<Integer> harga = new ArrayList<>();
    
    public void setTransaksi(int idClient, int durasi, int banyak, int idJenis, int harga){
        this.idClient.add(idClient);
        this.idJenis.add(idJenis);
        this.durasi.add(durasi);
        this.banyak.add(banyak);
        this.harga.add(harga);
    }
    
    public void prosesT(Client client, JenisLaundry jL, Petugas petugas, Laporan laporan){
        Scanner scan = new Scanner(System.in);
        String lanjut ="";
        while (!lanjut.equalsIgnoreCase("Yes")) {
            System.out.println("Selamat Datang");
            System.out.print("Login Sebagai Client / Petugas : ");
            String mM = scan.next();
            if (mM.equalsIgnoreCase("Client")) {
                System.out.print("ID: ");
                int id = scan.nextInt();
                System.out.print("Selamat Datang " + client.getNama(id));
                System.out.println("");
                System.out.println("Jenis Laundry : ");
                for (int i = 0; i < jL.getJumlahJ(); i++) {
                    System.out.println((i + 1) + ". " + jL.getJenis(i));
                }
                System.out.print("Pilih: ");
                int jenisL = scan.nextInt() - 1;
                System.out.println("Banyak Laundry dalam (Kg) : ");
                int kG = scan.nextInt();
                int harga = kG * jL.getHarga(jenisL);
                setTransaksi(id, jL.getDurasi(jenisL), kG, jenisL, harga);
                System.out.println("Harga: " + harga);
                        int total = 0;
        int x = idJenis.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jL.getHarga(idJenis.get(j));
            total += jumlah;
            if (client.getSaldo(id) < jumlah) {
                System.out.println("Maaf Saldo Anda kurang.");
                System.out.print("1. Edit Saldo\n2. Hentikan Transaksi\n= ");
                int saldo = scan.nextInt();
                switch (saldo){
                    case 1:
                        System.out.print("Masukkan saldo baru: ");
                        int newSaldo = scan.nextInt();
                        client.editSaldo(id, newSaldo);
//                        laporan.laporan(client);
                        break;
                }
            }
        }
//                System.out.println("Harga: " + harga);
                client.editSaldo(id, client.getSaldo(id) - harga); // Mengurangi saldo client
                System.out.println("Saldo anda: " + client.getSaldo(id));
                
            }         
            
            else if (mM.equalsIgnoreCase("Petugas")) {
                System.out.print("ID: ");
                int idL = scan.nextInt();
                System.out.print("Selamat Datang " + petugas.getNama(idL) + "\n1. List Transaksi\n2. List Client\n3. List Petugas\nPilih: ");
                int pilih = scan.nextInt();
                
                switch (pilih) {
                    case 1 -> {
                        laporan.laporan(this, jL);
                    }
                    
                    case 2 -> {
                        laporan.laporan(client);
                    }
                    
                    case 3 -> {
                        laporan.laporan(petugas);
                    }
                }
            }
            
            System.out.print("Berhenti(yes/no)? ");
            lanjut = scan.next();
        
    }
        }
    
    public int getJmlTransaksi() {
        return idClient.size();
    }
    
    public int getHarga(int id) {
        return this.harga.get(id);
    }
    
    public int getJenis(int id) {
        return this.idJenis.get(id);
    }
    
    public int getDurasi(int id) {
        return this.durasi.get(id);
    }
}



        
