package tugasakhirpbo;

import java.util.Random;

public class MobilCaravanTua extends Deskripsi000 {
     private String nama = "Mobil CaravanTua";
     private int hentakan;
     private int suhu;
     private int terkaman;
     private int radiasi;
     private int bising;
     private int racun;
    public void aturhentakan(){
        Random acak = new Random();
        int batasatas = 20; 
        int batasbawah = 1; 
      
        int angkaacak = acak.nextInt(batasatas-batasbawah)+batasbawah;
        this.hentakan=angkaacak;
      
    }
    
    public void atursuhu(){
        Random acak = new Random();
        int batasatas = 20; 
        int batasbawah = 1; 
      
        int angkaacak = acak.nextInt(batasatas-batasbawah);
        this.suhu=angkaacak;
    }
    
    public void aturterkaman(){
        Random acak = new Random();
        int batasatas = 2; 
        int batasbawah = 1; 
      
        int angkaacak = acak.nextInt(batasatas-batasbawah);
        this.terkaman=angkaacak;
    }
    
    public void aturradiasi(){
        Random acak = new Random();
        int batasatas = 20; 
        int batasbawah = 1; 
      
        int angkaacak = acak.nextInt(batasatas-batasbawah);
        this.radiasi=angkaacak;
    }
    
    public void aturbising(){
        Random acak = new Random();
        int batasatas = 10; 
        int batasbawah = 1; 
      
        int angkaacak = acak.nextInt(batasatas-batasbawah);
        this.bising=angkaacak;
    }
    
    public void aturracun(){
        Random acak = new Random();
        int batasatas = 2; 
        int batasbawah = 1; 
      
        int angkaacak = acak.nextInt(batasatas-batasbawah);
       this.racun=angkaacak;
    }
    public int lihathentakan(){
        return hentakan;
    }
    
    public int lihatsuhu(){
        return suhu;
    }
    
    public int lihatterkaman(){
        return terkaman;
    }
    
    public int lihatradiasi(){
        return radiasi;
    }
    
    public int lihatbising(){
        return bising;
    }
    
    public int lihatracun(){
        return racun;
    }
    public int kerusakan(){
        return lihatbising()+lihathentakan()+lihatracun()+lihatradiasi()+lihatsuhu()+lihatterkaman();
    }
    public String lihatnama(){
        return nama;
    }
}
