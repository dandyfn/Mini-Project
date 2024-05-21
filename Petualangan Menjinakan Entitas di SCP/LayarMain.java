package tugasakhirpbo;


import java.util.Scanner;

public class LayarMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keluarprogram;
        String spasi;
        Deskripsi000 o1;
        Deskripsi000 o2;
        Deskripsi000 o3;
        Deskripsi000 o4;
        Deskripsi000 o5;
        Deskripsi000 o6;
        boolean apakahkeluar = false;
        boolean masukankeluar = true;
        boolean keluar = true;
        String kodepengumpan;
        KarakterMain partisipan;
        do {
            System.out.print("Selamat datang pada perjamuan hari ini!");
            spasi = input.nextLine();
        } while (!spasi.equals(""));
        do {
            System.out.print("Anda sudah bergabung dengan yayasan SCP (Secure Contain Protect)");
            spasi = input.nextLine();
        } while (!spasi.equalsIgnoreCase(""));
        do {
            System.out.print("Kami dengar, anda adalah seorang pemberani");
            spasi = input.nextLine();
        } while (!spasi.equalsIgnoreCase(""));
        do {
            System.out.print("Ada banyak entitas yang berhasil kami tangkap");
            spasi = input.nextLine();
        } while (!spasi.equalsIgnoreCase(""));
        do {
            System.out.print("Anda harus menjinakan entitas-entitas ini");
            spasi = input.nextLine();
        } while (!spasi.equalsIgnoreCase(""));
        do {
            System.out.print("Namun, anda harus berhati-hati dengan mereka");
            spasi = input.nextLine();
        } while (!spasi.equalsIgnoreCase(""));
        do {
            System.out.print("Mereka sangat liar!!");
            spasi = input.nextLine();
        } while (!spasi.equalsIgnoreCase(""));
        do {
            System.out.print("!!!");
            spasi = input.nextLine();
        } while (!spasi.equalsIgnoreCase(""));
        System.out.println("Masukan nama anda");
        String nama = input.nextLine();
         partisipan = new KarakterMain(nama);
        String pernyataan=null;
        do {
            
            do {
                System.out.print("............................");
                spasi = input.nextLine();
            } while (!spasi.equalsIgnoreCase(""));
            do {
                System.out.print("Peraturan : anda tidak bisa keluar sebelum kalah");
                spasi = input.nextLine();
            } while (!spasi.equalsIgnoreCase(""));
            do {
                System.out.print("*pencet enter jika tidak ada perintah untuk menuliskan masukan");
                spasi = input.nextLine();
            } while (!spasi.equalsIgnoreCase(""));
            do {
                System.out.print("Anda sedang dibawa menuju ruangantkgo049-4o5");
                spasi = input.nextLine();
            } while (!spasi.equalsIgnoreCase(""));
            do {
                System.out.print("Ruangan p3ny1mp4nan 3ntit4ta5");
                spasi = input.nextLine();
            } while (!spasi.equalsIgnoreCase(""));
            do {
               System.out.print("............................");
               spasi = input.nextLine();
            } while (!spasi.equalsIgnoreCase(""));
            do {
               System.out.print("Radiasi dari entitas menimbulkan beberapa kerusakan sistem");
               spasi = input.nextLine();
            } while (!spasi.equalsIgnoreCase(""));
           
           
            do {
                do {
                    System.out.print("B1\tK4\tL1\tM5\tO9\tP8");
                    spasi=input.nextLine();
                } while (!spasi.equalsIgnoreCase(""));    
                do {
                    System.out.println("Pilih kunci kode!!");
                } while (!spasi.equalsIgnoreCase(""));
               do {
                    kodepengumpan = input.nextLine();
               } while (!spasi.equalsIgnoreCase(""));
               do {
                   System.out.print("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                   spasi = input.nextLine();
               } while (!spasi.equalsIgnoreCase(""));
                
            if (kodepengumpan.equals("B1")) {
                o1 = new BolaApiMercusuar();
                o1.aturhentakan(); o1.aturbising(); o1.aturracun(); o1.aturradiasi(); o1.atursuhu(); o1.aturterkaman();  
               if (KarakterMain.nyawa>o1.kerusakan()) {
                partisipan.menyerang(o1);
                apakahkeluar=true;
               } else {
                partisipan.terserang(o1);
                apakahkeluar=false;
                pernyataan="anda telah kalah melawan anomali";
               }
            } else if (kodepengumpan.equals("K4")) {
                o2 = new KeretaDalamKereta();
                o2.aturhentakan(); o2.aturbising(); o2.aturracun(); o2.aturradiasi(); o2.atursuhu(); o2.aturterkaman();
                if (KarakterMain.nyawa>o2.kerusakan()) {
                    partisipan.menyerang(o2);
                    apakahkeluar=true;
                   } else {
                    partisipan.terserang(o2);
                    apakahkeluar=false;
                    pernyataan="anda telah kalah melawan anomali";
                   }
            } else if (kodepengumpan.equals("L1")) {
                o3 = new LantaiTerlarang17();
                o3.aturhentakan(); o3.aturbising(); o3.aturracun(); o3.aturradiasi(); o3.atursuhu(); o3.aturterkaman();
                if (KarakterMain.nyawa>o3.kerusakan()) {
                    partisipan.menyerang(o3);
                    apakahkeluar=true;
                   } else {
                    partisipan.terserang(o3);
                    apakahkeluar=false;
                    pernyataan="anda telah kalah melawan anomali";
                   }
            } else if (kodepengumpan.equals("M5")) {
                o4 = new ManusiaSirine();
                o4.aturhentakan(); o4.aturbising(); o4.aturracun(); o4.aturradiasi(); o4.atursuhu(); o4.aturterkaman();
                if (KarakterMain.nyawa>o4.kerusakan()) {
                    partisipan.menyerang(o4);
                    apakahkeluar=true;
                   } else {
                    partisipan.terserang(o4);
                    apakahkeluar=false;
                    pernyataan="anda telah kalah melawan anomali";
                   }
            } else if (kodepengumpan.equals("O9")) {
                o5 = new MobilCaravanTua();
                o5.aturhentakan(); o5.aturbising(); o5.aturracun(); o5.aturradiasi(); o5.atursuhu(); o5.aturterkaman();
                if (KarakterMain.nyawa>o5.kerusakan()) {
                    partisipan.menyerang(o5);
                    apakahkeluar=true;
                   } else {
                    partisipan.terserang(o5);
                    apakahkeluar=false;
                    pernyataan="anda telah kalah melawan anomali";
                   }
            } else if (kodepengumpan.equals("P8")) {
                o6 = new PulauBerjalan();
                o6.aturhentakan(); o6.aturbising(); o6.aturracun(); o6.aturradiasi(); o6.atursuhu(); o6.aturterkaman();
                if (KarakterMain.nyawa>o6.kerusakan()) {
                    partisipan.menyerang(o6);
                    apakahkeluar=true;
                   } else {
                    partisipan.terserang(o6);
                    apakahkeluar=false;
                    pernyataan="anda telah kalah melawan anomali";
                   }
            } else {
                System.out.println("+-+-+-+-+-+program gagal+-+-+-+-+-+\n");
                pernyataan="masukan kode kunci dengan benar?<";
            }
  
         System.out.println("nyawa kamu \t= "+KarakterMain.nyawa);
         System.out.println("lencana \t= "+KarakterMain.lencana);
            } while (apakahkeluar);
         System.err.println(pernyataan+"\napakah anda yakin tidak ingin keluar?");
       do {
        System.out.println("ketik : keluar/tidak");
       keluarprogram =input.nextLine();
         if (keluarprogram.equalsIgnoreCase("tidak")) {
              masukankeluar = false;
              keluar = true;
              KarakterMain.nyawa=50;
            } else if (keluarprogram.equalsIgnoreCase("keluar")) {
                masukankeluar = false;
                keluar = false;
           } else {
                System.out.println("masukan dengan benar!!");
                masukankeluar = true;
           }
       } while (masukankeluar);
    } while (keluar);
      partisipan.jejak();
       
        
            input.close();
        

       
     

}}
