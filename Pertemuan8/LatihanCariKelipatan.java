package Pertemuan8;

public class LatihanCariKelipatan {
    public static void main(String[] args) {
        System.out.println("=== CARI KELIPATAN 7 === ");
        for(int angka = 1; angka <= 50; angka++){
            System.out.println("Cek: " + angka);
            if(angka % 7 == 0){
                System.out.println("[OK] Kelipatan 7 pertama: " + angka);
                System.out.println("Pencarian selesai.");
                break;
            }
        }
    }
}
