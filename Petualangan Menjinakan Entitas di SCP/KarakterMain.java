package tugasakhirpbo;

public class KarakterMain extends Deskripsi000  {
    static int nyawa = 50;
    static String nama;
    static int lencana;
    KarakterMain(String nama){
        KarakterMain.nama=nama;
    }
 
    public void menyerang(Deskripsi000 entitas){
        KarakterMain.lencana=lencana+1;
        System.out.println("kamu menyerang "+entitas.lihatnama());
    };
    public void terserang(Deskripsi000 entitas){
        KarakterMain.nyawa=KarakterMain.nyawa - entitas.kerusakan();
        System.out.println("BERBAHAYA!!\nBERBAHAYA!!\nBERBAHAYA!!");
        System.out.println("Kamu diserang "+entitas.lihatnama());
    };
    
    
}
