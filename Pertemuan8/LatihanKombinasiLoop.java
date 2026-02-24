package Pertemuan8;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        boolean menemukan = false;
        for(int outer = 1; outer <= 3 && !menemukan; outer++){
            for(int inner = 1; inner <= 5; inner++){
                System.out.println("Cek: [" + outer + ", " + inner + "]");
                if(outer == 2 && inner == 3){ //koordinat ditemukan
                    menemukan = true;
                    System.out.println("[OK] Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    break; //proses iterasi inner berhenti
                }
            }
        }
    }
}
