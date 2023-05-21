package beneran_UKL;

import java.util.ArrayList;

public class JenisLaundry {
    
    ArrayList<String> jenis = new ArrayList<>();
    ArrayList<Integer> durasi = new ArrayList<>();
    ArrayList<Integer> harga = new ArrayList<>();

    public JenisLaundry() {
        this.jenis.add("Setrika");
        this.durasi.add(2);
        this.harga.add(7_000);
 
        this.jenis.add("Dry Cleaning");
        this.durasi.add(1);
        this.harga.add(10_000);
        
    }
    
    public int getJumlahJ(){
        return this.jenis.size();
    }
    public void setJenis(String jenis){
        this.jenis.add(jenis);
    }
    public String getJenis(int idJenis){
        return this.jenis.get(idJenis);
    }
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    public int getDurasi(int idJenis){
        return this.durasi.get(idJenis);
    }
    public void editDurasi(int idJenis, int durasi){
        this.durasi.set(idJenis, durasi);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int idJenis){
        return this.harga.get(idJenis);
    }

}
