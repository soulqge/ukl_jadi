package beneran_UKL;

import java.util.ArrayList;

public class Petugas implements aL {
    
    private ArrayList <String> namaP = new ArrayList <String>();
    private ArrayList <String> alamat = new ArrayList <String>();
    private ArrayList <String> telp = new ArrayList <String>();
    private ArrayList <Integer> jabat = new ArrayList <Integer>();
    String jabatan[] = {"karyawan","bos"};
    
    //======================================
    
    public Petugas(){
        this.namaP.add("Arfa");
        this.alamat.add("Dinoyo");
        this.telp.add("081358087866");
        this.jabat.add(0);
        
        this.namaP.add("Arvin");
        this.alamat.add("Araya");
        this.telp.add("081770172414");
        this.jabat.add(0);
        
    }
    
    //======================================
    
    @Override
    public void setNama(String namaP){
        this.namaP.add(namaP);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelp(String telp){
        this.telp.add(telp);
    }
    public void setJabat(int saldo){
        this.jabat.add(saldo);
    }
    
    
    //======================================
     
    @Override
     public String getNama(int id){
         return this.namaP.get(id);
     }
    @Override
     public String getAlamat(int id){
         return this.alamat.get(id);
     }
    @Override
     public String getTelp(int id){
         return this.telp.get(id);
     }
     public Integer getJabat( int IdMember ){
        return this.jabat.get(IdMember);
    }
     
      public int getJumlahP(){
        return namaP.size();
    }
}
