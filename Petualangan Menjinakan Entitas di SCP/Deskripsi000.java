package tugasakhirpbo;

public class Deskripsi000 extends PoinAkhir implements Serangan000{  
     private String nama;
     private int hentakan;
     private int suhu;
     int terkaman;
     int radiasi;
     int bising;
     int racun;

    public void aturhentakan( ){
        
    }
    
    public void atursuhu(){

    }
    
    public void aturterkaman(){

    }
    
    public void aturradiasi(){

    }
    
    public void aturbising(){

    }
    
    public void aturracun(){

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
        return hentakan+suhu+terkaman+radiasi+bising+racun;
    }
    public String lihatnama(){
        return nama;
    }

    public void menyerang(Deskripsi000 entitas) {
    }

    public void terserang(Deskripsi000 entitas) {
    }

    public void jejak() {
       String skala;
        if (KarakterMain.lencana<=5) {
            skala="npc";
        }  else if (KarakterMain.lencana>5&&KarakterMain.lencana<=66) {
            skala="ajudan";
        } else if (KarakterMain.lencana>66&&KarakterMain.lencana<=235) {
            skala="sejati";
        }else if (KarakterMain.lencana>235&&KarakterMain.lencana<=680) {
            skala="mc";
        }else{
           skala="god"; 
        }
        System.out.println("Terimaksih telah bantu menjinakan dan mengurangi daya kekuatan mereka");
        System.out.println("Lencana             : "+KarakterMain.lencana);
        System.out.println("Nyawa Akhir         : "+KarakterMain.nyawa);
        System.out.println("Skala penghormatan  : "+skala);
        System.out.println("Medali akan di berikan atas nama \t: "+KarakterMain.nama);
        System.out.println("Secure Contain Protect society");
    }
    
    
}
