package Pertemuan7;

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        int angka = 7;
        int hasil;
        System.out.println("=== TABEL PERKALIAN 7 ===");
        for (int i = 1; i <= 12; i++){
            hasil = i * angka;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
    
}
