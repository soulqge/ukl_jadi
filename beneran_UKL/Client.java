package beneran_UKL;

import java.util.ArrayList;

public class Client implements aL {
      
    private ArrayList <String> namaC = new ArrayList <>();
    private ArrayList <String> alamat = new ArrayList <>();
    private ArrayList <String> telp = new ArrayList <>();
    private ArrayList <Integer> saldo = new ArrayList <>();
    
    //======================================
    
    public Client(){
        this.namaC.add("Al");
        this.alamat.add("Sawojajar");
        this.telp.add("085785546217");
        this.saldo.add(150_000);
        
        this.namaC.add("Fatra");
        this.alamat.add("Pakis");
        this.telp.add("081334235014");
        this.saldo.add(125_000);
    }
    
    //======================================
    
    @Override
    public void setNama(String namaC){
        this.namaC.add(namaC);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelp(String telp){
        this.telp.add(telp);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    //======================================
    
    public int getSaldo(int id){
        return this.saldo.get(id);
    }
     public void editSaldo(int Id, int saldo){
        this.saldo.set(Id, saldo);
    }
     public int jumlahC(){
         return this.saldo.size();
     }
     
     //======================================
     
    @Override
     public String getNama(int id){
         return this.namaC.get(id);
     }
    @Override
     public String getAlamat(int id){
         return this.alamat.get(id);
     }
    @Override
     public String getTelp(int id){
         return this.telp.get(id);
     }
     
     public int getJumlahC(){
        return namaC.size();
    }


    
}
